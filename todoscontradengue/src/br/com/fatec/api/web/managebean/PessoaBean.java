package br.com.fatec.api.web.managebean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.fatec.api.entity.Pessoa;
import br.com.fatec.core.helper.PessoaFactoryDaoImpl;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> pessoas;

	public List<Pessoa> getPessoas() {
		
		if(this.pessoas == null){
			this.pessoas = PessoaFactoryDaoImpl.getPessoaDaoImpl().findAllPessoas();
		}
		return this.pessoas; 
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public String salvar(Pessoa pessoa){
		if(PessoaFactoryDaoImpl.getPessoaDaoImpl().pessoaSave(pessoa) == 1){
			return "sucess";
		}
		return "fail";
	}
	
	public void delete(int id){
		PessoaFactoryDaoImpl.getPessoaDaoImpl().pessoaDelete(id);
	}
	
	public void findById(int id){
		PessoaFactoryDaoImpl.getPessoaDaoImpl().findById(id);
	}
	
	public void findAll(){
		List<Pessoa> pessoas = PessoaFactoryDaoImpl.getPessoaDaoImpl().findAllPessoas();
	}

}
