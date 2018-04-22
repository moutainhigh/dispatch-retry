package com.wms.studio.dispatch.retry.repository;

import com.wms.studio.dispatch.retry.domain.TaskLog;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-22 16:22
 *
 */
public interface TaskLogRepo
{
	int saveTaskLog(TaskLog taskLog);
}
