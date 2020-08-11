package uk.ac.hutton.ics.brapi.resource;

public class ObservationLevel
{
	private String  levelName;
	private Integer levelOrder;

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
