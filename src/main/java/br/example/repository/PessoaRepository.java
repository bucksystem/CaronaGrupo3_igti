package br.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, Long> {

	@Query("select p from Pessoa p where p.nome like :x")
	public Page<Pessoa> pessoaSearch( @Param("x")String mc, Pageable p );

	public List<Pessoa> findByNome( String name );
	
}