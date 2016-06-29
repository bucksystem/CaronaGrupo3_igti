package br.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Carona;

@Repository
public interface CaronaRepository extends MongoRepository<Carona, Integer> {

	@Query("select p from Carona  p where p.nome like :x")
	public Page<Carona> usuarioSearch( @Param("x")String mc, Pageable p );

	public List<Carona> findById( Long id );
	
}

