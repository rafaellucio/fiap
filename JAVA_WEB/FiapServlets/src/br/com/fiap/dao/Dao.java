package br.com.fiap.dao;

import java.util.List;

public interface Dao<T> {

	void insert(T entity);
	void update(T entity);
	void delete(T entity);
	List<T> getList();
	T get(int id);

}
