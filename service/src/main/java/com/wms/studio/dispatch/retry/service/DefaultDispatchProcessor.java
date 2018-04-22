package com.wms.studio.dispatch.retry.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.apache.commons.lang.StringUtils;

import com.wms.studio.dispatch.retry.api.BizDispatchHandler;
import com.wms.studio.dispatch.retry.api.DispatchProcessor;
import com.wms.studio.dispatch.retry.api.RetryDispatchHandler;
import com.wms.studio.dispatch.retry.api.bean.DispatchTask;
import com.wms.studio.dispatch.retry.api.bean.DispatchTaskType;
import com.wms.studio.dispatch.retry.service.retry.DefaultRetryDispatchHandler;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-21 20:19
 *
 */
public class DefaultDispatchProcessor implements DispatchProcessor
{
	// cache biz handlers
	private static final ConcurrentMap<String, BizDispatchHandler> HANDLER_CONCURRENT_MAP = new ConcurrentHashMap<>();

	private RetryDispatchHandler defaultRetryDispatchHandler = new DefaultRetryDispatchHandler();

	@Override
	public void submitTask(DispatchTask task, DispatchTaskType taskType)
	{
		//check params

		//save task

		//execute task
	}

	@Override
	public void registerBizHandler(BizDispatchHandler handler)
	{
		if (handler == null)
		{
			throw new IllegalArgumentException("业务调度处理器不允许为空handler");
		}
		if (StringUtils.isBlank(handler.getBizName()))
		{
			throw new IllegalArgumentException("业务参数不允许为空bizName");
		}
		HANDLER_CONCURRENT_MAP.put(handler.getBizName(), handler);
	}

}
