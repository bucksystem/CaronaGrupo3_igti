package br.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Passageiro;

@Repository
public interface PassageiroRepository extends MongoRepository<Passageiro, Integer> {

	@Query("select p from Passageiro p where p.nome like :x")
	public Page<Passageiro> passageiroSearch( @Param("x")String mc, Pageable p );

}

