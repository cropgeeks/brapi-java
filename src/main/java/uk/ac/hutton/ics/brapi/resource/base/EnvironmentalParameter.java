package uk.ac.hutton.ics.brapi.resource.base;

public class EnvironmentalParameter
{
	private String description;
	private String parameterName;
	private String parameterPUI;
	private String unit;
	private String unitPUI;
	private String value;
	private String valuePUI;

	public String getDescription()
	{
		return description;
	}

	public EnvironmentalParameter setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public String getParameterName()
	{
		return parameterName;
	}

	public EnvironmentalParameter setParameterName(String parameterName)
	{
		this.parameterName = parameterName;
		return this;
	}

	public String getParameterPUI()
	{
		return parameterPUI;
	}

	public EnvironmentalParameter setParameterPUI(String parameterPUI)
	{
		this.parameterPUI = parameterPUI;
		return this;
	}

	public String getUnit()
	{
		return unit;
	}

	public EnvironmentalParameter setUnit(String unit)
	{
		this.unit = unit;
		return this;
	}

	public String getUnitPUI()
	{
		return unitPUI;
	}

	public EnvironmentalParameter setUnitPUI(String unitPUI)
	{
		this.unitPUI = unitPUI;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public EnvironmentalParameter setValue(String value)
	{
		this.value = value;
		return this;
	}

	public String getValuePUI()
	{
		return valuePUI;
	}

	public EnvironmentalParameter setValuePUI(String valuePUI)
	{
		this.valuePUI = valuePUI;
		return this;
	}
}
