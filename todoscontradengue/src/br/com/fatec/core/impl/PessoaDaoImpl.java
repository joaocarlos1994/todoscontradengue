package br.com.fatec.core.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fatec.api.entity.Pessoa;
import br.com.fatec.api.service.PessoaDAO;
import br.com.fatec.core.helper.db.DataBaseConnectionFactory;

public class PessoaDaoImpl implements PessoaDAO{
	
	private Pessoa pessoa;

	@Override
	public int pessoaSave(Pessoa pessoa) {
		
		EntityManager em = DataBaseConnectionFactory.getDataBaseConnectionFactory().createConnectionDB();
		em.getTransaction().begin();		
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();
		
		
		return 1;
	}

	@Override
	public int pessoaDelete(int id) {
		
		EntityManager em = DataBaseConnectionFactory.getDataBaseConnectionFactory().createConnectionDB();
		em.getTransaction().begin();		
		em.remove(findById(id)); //chamando o método findById
		em.getTransaction().commit();
		em.close();
		
		return 1;
	}

	@Override
	public Pessoa findById(int id) {
		
		EntityManager em = DataBaseConnectionFactory.getDataBaseConnectionFactory().createConnectionDB();
		em.getTransaction().begin();		
		Pessoa pessoa = em.getReference(Pessoa.class, id);
		em.getTransaction().commit();
		em.close();
		
		return pessoa;
	}

	@Override
	public List<Pessoa> findAllPessoas() {
		
		EntityManager em = DataBaseConnectionFactory.getDataBaseConnectionFactory().createConnectionDB();
		em.getTransaction().begin();		
		List<Pessoa> pessoas = em.createQuery("Select a from Pessoa a", Pessoa.class).getResultList();
		em.getTransaction().commit();
		em.close();
		
		return pessoas;
	}

}
