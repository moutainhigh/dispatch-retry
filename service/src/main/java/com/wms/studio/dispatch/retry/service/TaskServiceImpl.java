package com.wms.studio.dispatch.retry.service;

import com.wms.studio.dispatch.retry.api.TaskService;
import com.wms.studio.dispatch.retry.domain.Task;
import com.wms.studio.dispatch.retry.repository.TaskLogRepo;
import com.wms.studio.dispatch.retry.repository.TaskRepo;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-22 16:26
 *
 */
public class TaskServiceImpl implements TaskService
{
	private TaskRepo taskRepo;

	private TaskLogRepo taskLogRepo;

	@Override
	public void saveTask(Task task)
	{

	}
}
