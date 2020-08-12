package uk.ac.hutton.ics.brapi.resource.base;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.observation.ObservationVariable;

public class TableResult<T>
{
	private List<T>                   data;
	private List<String>              headerRow;
	private List<ObservationVariable> observationVariables;

	public List<T> getData()
	{
		return data;
	}

	public TableResult<T> setData(List<T> data)
	{
		this.data = data;
		return this;
	}

	public List<String> getHeaderRow()
	{
		return headerRow;
	}

	public TableResult<T> setHeaderRow(List<String> headerRow)
	{
		this.headerRow = headerRow;
		return this;
	}

	public List<ObservationVariable> getObservationVariables()
	{
		return observationVariables;
	}

	public TableResult<T> setObservationVariables(List<ObservationVariable> observationVariables)
	{
		this.observationVariables = observationVariables;
		return this;
	}
}
