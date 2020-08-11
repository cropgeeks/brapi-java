package uk.ac.hutton.ics.brapi.resource.base;

public class Status
{
	private String message;
	private String messageType;

	public String getMessage()
	{
		return message;
	}

	public Status setMessage(String message)
	{
		this.message = message;
		return this;
	}

	public String getMessageType()
	{
		return messageType;
	}

	public Status setMessageType(String messageType)
	{
		this.messageType = messageType;
		return this;
	}
}
