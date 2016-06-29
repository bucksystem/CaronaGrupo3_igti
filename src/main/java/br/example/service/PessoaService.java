package br.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.model.Pessoa;

import br.example.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> listar() {
		return (List<Pessoa>)pessoaRepository.findAll();
	}

	public Page<Pessoa> listar( int page ) {
		return pessoaRepository.findAll( new PageRequest(page,5) );
	}
	
	public Page<Pessoa> listar(String search, int page ) {
		return pessoaRepository.pessoaSearch( "%"+search+"%", new PageRequest(page, 10) );
	}

	public Pessoa get( Integer id ) {
		Pessoa pessoa = pessoaRepository.findOne(id);
		return pessoa;
	}
	
	public boolean delete( Integer id ) {
		pessoaRepository.delete(id);
		return true;
	}
	
	public Pessoa update( Pessoa usuario ) {
		pessoaRepository.save(usuario);
		return usuario;
	}
	
	public Pessoa save( Pessoa pessoa ) {
		pessoaRepository.save(pessoa);
		return pessoa;
	}
	
}