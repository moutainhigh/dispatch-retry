package com.wms.studio.dispatch.retry.api.bean;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-21 19:59
 *
 */
public class DispatchTask
{
	private String bizName;
	private String bizType;
	private String bizId;
	private JSONObject bizContent;

	public DispatchTask()
	{
	}

	public DispatchTask(String bizName, String bizType, String bizId, JSONObject bizContent)
	{
		this.bizName = bizName;
		this.bizType = bizType;
		this.bizId = bizId;
		this.bizContent = bizContent;
	}

	public String getBizName()
	{
		return bizName;
	}

	public void setBizName(String bizName)
	{
		this.bizName = bizName;
	}

	public String getBizType()
	{
		return bizType;
	}

	public void setBizType(String bizType)
	{
		this.bizType = bizType;
	}

	public JSONObject getBizContent()
	{
		return bizContent;
	}

	public void setBizContent(JSONObject bizContent)
	{
		this.bizContent = bizContent;
	}

	public String getBizId()
	{
		return bizId;
	}

	public void setBizId(String bizId)
	{
		this.bizId = bizId;
	}
}
