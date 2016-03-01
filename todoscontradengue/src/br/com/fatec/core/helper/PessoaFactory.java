package br.com.fatec.core.helper;

import br.com.fatec.api.entity.Pessoa;

public class PessoaFactory {
	
	
	public static Pessoa factoryPessoa(String nome, String email, String password){
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		pessoa.setEmail(email);
	
		return pessoa;
	}
	

}
