package com.wms.studio.dispatch.retry.api;

import com.wms.studio.dispatch.retry.api.bean.DispatchTask;
import com.wms.studio.dispatch.retry.api.bean.Result;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-21 19:57
 *
 */
public interface BizDispatchHandler
{
	public Result executeTask(DispatchTask task);

	public String getBizName();

	public String getBizType();

	public RetryDispatchHandler getRetryDispatchHandler();
}
