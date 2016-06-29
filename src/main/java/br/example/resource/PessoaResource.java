package br.example.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Pessoa;

import br.example.service.PessoaService;

@Transactional
@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public ResponseEntity<List<Pessoa>> getPessoas(){
		List<Pessoa> Pessoas = pessoaService.listar();
		return 	ResponseEntity
				.status(HttpStatus.OK)
				.body(Pessoas);
	}

	@RequestMapping(value = "/{id}",  method = RequestMethod.GET)
	public ResponseEntity<Pessoa> buscar( @PathVariable("id") Integer id ) {
		Pessoa Pessoa = pessoaService.get(id);
		return 	ResponseEntity
				.status(HttpStatus.OK)
				.body(Pessoa);
	}
	
	//-------------------------------------
	@Deprecated
	@RequestMapping(value="/pag", method=RequestMethod.GET)
	public ResponseEntity<Page<Pessoa>> getPessoas( int page ){
		Page<Pessoa> Pessoa = (Page<Pessoa>)pessoaService.listar(page);
		return 	ResponseEntity
				.status(HttpStatus.OK)
				.body(Pessoa);
	}

	@RequestMapping(value="/search", method = RequestMethod.GET)
	public ResponseEntity<Page<Pessoa>> getPessoas( String search, int page ) {
		Page<Pessoa> Pessoa = (Page<Pessoa>)pessoaService.listar( search, page );
		return 	ResponseEntity
				.status(HttpStatus.OK)
				.body(Pessoa);
	}

	@RequestMapping(value="/get", method=RequestMethod.GET)
	public Pessoa getPessoa( Integer ref ){
		return  pessoaService.get(ref);
	}

	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public boolean deletePessoa( Integer ref ){
		return  pessoaService.delete(ref);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public Pessoa updatePessoa( Pessoa u ){
		return  pessoaService.update(u);
	}

	@RequestMapping(value="/save", method=RequestMethod.GET)
	public Pessoa savePessoa( Pessoa u ){
		return  pessoaService.save(u);
	}
	
}