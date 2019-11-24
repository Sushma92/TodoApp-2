package com.todo.services;

import com.todo.common.entity.BaseEntity;

public class BaseService<T extends BaseEntity, R> {

	public R create(T entity) {
		return null;
	}

	public R update(T entity) {
		return null;
	}

	public T read(Long id) {
		return null;
	}

	public void delete(Long id) {
	}
}
