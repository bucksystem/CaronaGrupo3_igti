package br.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Endereco;

@Repository
public interface EnderecoRepository extends PagingAndSortingRepository<Endereco, Integer> {

	@Query("select p from Endereco")
	public Page<Endereco> usuarioSearch( @Param("x")String mc, Pageable p );

}

