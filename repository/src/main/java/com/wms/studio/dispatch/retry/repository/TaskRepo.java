package com.wms.studio.dispatch.retry.repository;

import com.wms.studio.dispatch.retry.domain.Task;

import java.util.List;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-22 16:17
 *
 */
public interface TaskRepo
{
	int saveTask(Task task);

	int updateTask(Task task);

	List<Task> find();
}
