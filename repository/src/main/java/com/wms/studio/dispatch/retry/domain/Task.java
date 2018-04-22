package com.wms.studio.dispatch.retry.domain;


import java.sql.Timestamp;

/**
 *
 * @author hzwumsh
 * 创建时间 2018-04-22 16:15
 *
 */
public class Task
{
	private String bizName;
	private String bizType;
	private String bizId;
	private String bizContent;
	private Timestamp createTime;
	private Timestamp nextExecTime;
	private String state;
	private int execCount;
	private String envHashCode;

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

	public String getBizContent()
	{
		return bizContent;
	}

	public void setBizContent(String bizContent)
	{
		this.bizContent = bizContent;
	}

	public Timestamp getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(Timestamp createTime)
	{
		this.createTime = createTime;
	}

	public Timestamp getNextExecTime()
	{
		return nextExecTime;
	}

	public void setNextExecTime(Timestamp nextExecTime)
	{
		this.nextExecTime = nextExecTime;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public int getExecCount()
	{
		return execCount;
	}

	public void setExecCount(int execCount)
	{
		this.execCount = execCount;
	}

	public String getEnvHashCode()
	{
		return envHashCode;
	}

	public void setEnvHashCode(String envHashCode)
	{
		this.envHashCode = envHashCode;
	}
}
