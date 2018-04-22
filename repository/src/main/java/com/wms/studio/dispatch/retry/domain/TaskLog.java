package com.wms.studio.dispatch.retry.domain;


import java.sql.Timestamp;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-22 16:15
 *
 */
public class TaskLog
{
	private long id;
	private String bizName;
	private String bizType;
	private String bizId;
	private String state;
	private String content;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
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

	public String getBizId()
	{
		return bizId;
	}

	public void setBizId(String bizId)
	{
		this.bizId = bizId;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}
}
