package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import models.Telefone;
import models.Usuario;

public class UsuarioDAO {

	private EntityManagerFactory emf;

	private EntityManager em;

	public UsuarioDAO() {
		this.emf = Persistence.createEntityManagerFactory("test");
		this.em = emf.createEntityManager();
	}

	public Usuario salvarUsuario(Usuario usuario) {

		this.em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(usuario);
			for (Telefone t : usuario.getTelefone()) {
				t.setUsuario(usuario);
				em.persist(t);
			}
			em.getTransaction().commit();

			em.close();
			return usuario;

		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
			return null;
		}

	}

	public List<Usuario> listarUsuarios() {

		this.em = emf.createEntityManager();

		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		List<Usuario> list = query.getResultList();

		em.close();

		return list;

	}

	public Usuario consultarUsuario(Long id) {

		this.em = emf.createEntityManager();

		Usuario usuario = em.find(Usuario.class, id);

		em.close();

		return usuario;
	}

	public void alterarUsuario(Usuario usuario, Long id) {

		this.em = emf.createEntityManager();

		usuario.setId(id);

		try {
			em.getTransaction().begin();
			em.merge(usuario);
			em.getTransaction().commit();

			em.close();

		} catch (Exception ex) {
			ex.printStackTrace();
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void removerUsuario(Long id) {

		this.em = emf.createEntityManager();

		try {
			Usuario u = em.find(Usuario.class, id);
			System.out.println(u);
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();

		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

}
