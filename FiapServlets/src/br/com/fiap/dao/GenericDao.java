package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class GenericDao<T> implements Dao<T> {

	private final Class<T> entityClass;
	protected EntityManager entityManager;
	
	public GenericDao(Class<T> entity) {
		this.entityClass = entity;
	}
	
	@Override
	public void insert(T entity) {
		entityManager = DaoUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void update(T entity) {
		entityManager = DaoUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void delete(T entity) {
		entityManager = DaoUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.merge(entity));
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getList() {
		entityManager = DaoUtil.getEntityManager();
		return entityManager.createQuery("From " + entityClass.getSimpleName()).getResultList();
	}

	@Override
	public T get(int id) {
		entityManager = DaoUtil.getEntityManager();
		entityManager.getTransaction().begin();
		T entity = entityManager.find(entityClass, id);
		entityManager.getTransaction().commit();
		entityManager.close();
		return entity;
	}
}
