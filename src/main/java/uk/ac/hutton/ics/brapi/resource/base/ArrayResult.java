package uk.ac.hutton.ics.brapi.resource.base;

import java.util.List;

public class ArrayResult<T>
{
	private List<T> data;

	public List<T> getData()
	{
		return data;
	}

	public ArrayResult<T> setData(List<T> data)
	{
		this.data = data;
		return this;
	}
}
