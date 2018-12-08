package br.com.cursojava.aula10web.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula10web.utils.JPAUtil;

public class RepositorioProduto {
	
	public List<Produto> buscarTodos(){
		List<Produto> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("select p from Produto p", Produto.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public Produto buscarPorId(Integer id){
		return null;
	}
	
	public Produto salvar(Produto produto){
		return null;
	}
	
	public boolean remover(Produto produto){
		return false;
	}

}
