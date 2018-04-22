package com.wms.studio.dispatch.retry.api;

import com.wms.studio.dispatch.retry.api.bean.DispatchTask;
import com.wms.studio.dispatch.retry.api.bean.DispatchTaskType;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-21 20:16
 *
 */
public interface DispatchProcessor
{
	public void submitTask(DispatchTask task, DispatchTaskType taskType);

	public void registerBizHandler(BizDispatchHandler handler);

}
