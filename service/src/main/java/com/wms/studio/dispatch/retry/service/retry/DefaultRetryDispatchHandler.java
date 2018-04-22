package com.wms.studio.dispatch.retry.service.retry;

import com.wms.studio.dispatch.retry.api.RetryDispatchHandler;
import com.wms.studio.dispatch.retry.api.bean.DispatchTask;

import java.sql.Timestamp;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-21 20:29
 *
 */
public class DefaultRetryDispatchHandler implements RetryDispatchHandler
{
	@Override
	public Timestamp calcNextRetryTime(DispatchTask task, int currentExecCount)
	{
		return null;
	}

	@Override
	public String getBizName()
	{
		return "Default";
	}

	@Override
	public String getBizType()
	{
		return "Default";
	}
}
