package br.com.fatec.core.helper;

import br.com.fatec.core.impl.PessoaDaoImpl;

public class PessoaFactoryDaoImpl {
	
	private static PessoaDaoImpl pessoaDaoImpl = null;
	
	public static PessoaDaoImpl getPessoaDaoImpl(){
		if(pessoaDaoImpl == null){
			pessoaDaoImpl = new PessoaDaoImpl();
		}
		
		return pessoaDaoImpl;
		
	}
	

}
