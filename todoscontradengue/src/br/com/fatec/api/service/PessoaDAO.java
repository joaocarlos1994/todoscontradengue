package br.com.fatec.api.service;


import java.util.List;

import br.com.fatec.api.entity.Pessoa;

public interface PessoaDAO {
	
	public int pessoaSave(Pessoa pessoa);
	public int pessoaDelete(int id);
	public Pessoa findById(int id);
	public List<Pessoa> findAllPessoas();
	

}
