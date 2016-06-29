package br.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Motorista;

@Repository
public interface MotoristaRepository extends MongoRepository<Motorista, Integer> {

	@Query("select p from Motorista p where p.nome like :x")
	public Page<Motorista> motoristaSearch( @Param("x")String mc, Pageable p );

}

