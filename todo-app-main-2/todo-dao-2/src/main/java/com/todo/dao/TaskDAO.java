package com.todo.dao;

import org.springframework.stereotype.Repository;

import com.todo.common.entity.Task;

@Repository
public interface TaskDAO extends BaseDAO<Task, Task>{

}
