package br.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Carro;

@Repository
public interface CarroRepository extends MongoRepository<Carro, Integer> {

	@Query("select p from Carro  p where p.nome like :x")
	public Page<Carro> usuarioSearch( @Param("x")String mc, Pageable p );

	public List<Carro> findByModelo( Long modelo );
}