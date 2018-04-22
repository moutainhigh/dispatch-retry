package com.wms.studio.dispatch.retry.api;

import java.sql.Timestamp;

import com.wms.studio.dispatch.retry.api.bean.DispatchTask;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-21 20:26
 *
 */
public interface RetryDispatchHandler
{
	/**
	 * 计算下次执行时间
	 * @param task 任务
	 * @param currentExecCount 当前执行次数
	 * @return 下次重试时间
	 */
	public Timestamp calcNextRetryTime(DispatchTask task, int currentExecCount);

	public String getBizName();

	public String getBizType();
}
