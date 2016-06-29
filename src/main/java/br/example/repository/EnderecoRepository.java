package br.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, Integer> {

	@Query("select p from Endereco  p where p.nome like :x" )
	public Page<Endereco> usuarioSearch( @Param("x")String mc, Pageable p );

}

