package com.wms.studio.dispatch.retry.api;

import com.wms.studio.dispatch.retry.domain.Task;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-22 16:27
 *
 */
public interface TaskService
{
	public void saveTask(Task task);
}
