package com.vaadin.example.gxt.companydashboard.server;

import java.util.List;

public interface Dao<T, K> {
	T save(T entity);

	List<T> saveAll(List<T> entities);

	void remove(T entity);

	T findById(K id);

	List<T> findAll();
}
