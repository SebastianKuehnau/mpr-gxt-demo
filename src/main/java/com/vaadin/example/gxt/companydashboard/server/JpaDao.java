package com.vaadin.example.gxt.companydashboard.server;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class JpaDao<T extends AbstractEntity, K> implements Dao<T, K> {
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2");
	private final Class<T> entityClass;

	public JpaDao(Class<T> clazz) {
		this.entityClass = clazz;
	}

	public T save(T entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try {
			if (entity.getId() == null) {
				em.persist(entity);
			} else {
				entity = em.merge(entity);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		em.close();
		return entity;
	}

	public List<T> saveAll(List<T> entities) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try {
			List<T> result = new ArrayList<>();
			for (T entity : entities) {
				if (entity.getId() == null) {
					em.persist(entity);
				} else {
					entity = em.merge(entity);
				}
				result.add(entity);
			}
			em.getTransaction().commit();
			return result;
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		em.close();
		return new ArrayList<>(entities);
	}

	public void remove(T entity) {
		EntityManager em = emf.createEntityManager();
		em.remove(entity);
	}

	public T findById(K id) {
		EntityManager em = emf.createEntityManager();
		return em.find(entityClass, id);
	}

	protected EntityManager newEntityManager() {
		return emf.createEntityManager();
	}
}
