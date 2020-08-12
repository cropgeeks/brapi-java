package uk.ac.hutton.ics.brapi.resource.observation;

public class ObservationLevel
{
	private String  levelCode;
	private String  levelName;
	private Integer levelOrder;

	public String getLevelCode()
	{
		return levelCode;
	}

	public ObservationLevel setLevelCode(String levelCode)
	{
		this.levelCode = levelCode;
		return this;
	}

	public String getLevelName()
	{
		return levelName;
	}

	public ObservationLevel setLevelName(String levelName)
	{
		this.levelName = levelName;
		return this;
	}

	public Integer getLevelOrder()
	{
		return levelOrder;
	}

	public ObservationLevel setLevelOrder(Integer levelOrder)
	{
		this.levelOrder = levelOrder;
		return this;
	}
}
