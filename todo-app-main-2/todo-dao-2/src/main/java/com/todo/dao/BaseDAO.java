package com.todo.dao;

import com.todo.common.entity.BaseEntity;

public interface BaseDAO<T extends BaseEntity, R> {

	public R create(T entity);
	public R update(T entity);
	public T read(Long id);
	public void delete(Long id);
}
