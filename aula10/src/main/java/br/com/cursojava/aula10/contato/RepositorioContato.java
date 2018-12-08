package br.com.cursojava.aula10.contato;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula10.utils.JPAUtil;

public class RepositorioContato {
	
	public List<Contato> buscarTodos(){
		List<Contato> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c",Contato.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public Contato buscarPorId(Integer id){
		Contato contato = null;
		EntityManager em = JPAUtil.createEntityManager();
		contato = em.find(Contato.class, id);
		em.close();
		return contato;
	}
	
	public Contato buscarPorTelefone(String telefone){
		Contato contato = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em.createQuery("select c from Contato c where c.telefone = :telefone",Contato.class);
		query.setParameter("telefone", telefone);
		try{
			contato = query.getSingleResult(); 
		}catch(Exception e){
			contato = null;
		}
		return contato;
	}
	
	public List<Contato> buscarPorNome(String nome){
		List<Contato> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Contato> query = em
				.createQuery("select c from Contato c where upper(c.nome) like upper(:nome)",Contato.class);
		query.setParameter("nome", "%"+nome+"%");
		lista = query.getResultList();
		return lista;
		
	}
	
	public Contato salvar(Contato contato){
		if(contato != null){
			if(contato.getId() == null){
				return inserir(contato);
			}else{
				return atualizar(contato);
			}
		}
		return contato;
	}
	private Contato inserir(Contato contato){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
		return contato;
	}
	private Contato atualizar(Contato contato){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		contato = em.merge(contato);
		em.getTransaction().commit();
		em.close();
		return contato;
	}
	
	public void remover(Contato contato){
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(contato));
		em.getTransaction().commit();
		em.close();
	}
	
	
	
	
	public static void main(String[] args) {
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> todos = repositorio.buscarTodos();
		for (Contato contato : todos) {
			System.out.println(contato);
		}
		System.out.println("====== BUSCA POR TELEFONE =======");
		System.out.println(repositorio.buscarPorTelefone("999887700"));
		System.out.println("====== BUSCA POR NOME =======");
		todos = repositorio.buscarPorNome("silva");
		for (Contato contato : todos) {
			System.out.println(contato);
		}
		System.out.println("====== Remover =======");
		repositorio.remover(repositorio.buscarPorId(1));
		System.out.println("====== BUSCA POR ID =======");
		System.out.println(repositorio.buscarPorId(1));
		
////		Contato contato = new Contato();
////		contato.setNome("Bagrinho");
////		contato.setEmail("b@teste.com");
////		contato.setTelefone("999887700");
//		
//		EntityManager em = JPAUtil.createEntityManager();
//		Contato contato = em.find(Contato.class, 1);
//		em.close();
//		em = JPAUtil.createEntityManager();
//		em.getTransaction().begin();
//		contato.setNome("Bagrinho da Silva Brasil");
//		Contato contatoAtachado = em.merge(contato);
//		System.out.println(contatoAtachado == contato);
//		em.getTransaction().commit();
//		em.close();
//		JPAUtil.closeEmf();
	}

}
