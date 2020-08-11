package uk.ac.hutton.ics.brapi.resource.base;

import java.util.*;
import java.util.stream.Collectors;

public class BrapiCall
{
	private String       service;
	private List<String> dataTypes = new ArrayList<>();
	private List<String> methods   = new ArrayList<>();
	private List<String> versions  = new ArrayList<>();

	public BrapiCall()
	{
	}

	public BrapiCall(String service)
	{
		this.service = service;
	}

	public BrapiCall addMethod(Method method)
	{
		methods.add(method.name());
		return this;
	}

	public BrapiCall addDataType(DataType datatype)
	{
		dataTypes.add(datatype.type);
		return this;
	}

	public BrapiCall addVersion(Version version)
	{
		versions.add(version.number);
		return this;
	}

	public boolean hasDataType(DataType datatype)
	{
		return dataTypes.contains(datatype);
	}

	public boolean hasMethod(Method method)
	{
		return methods.contains(method);
	}

	public boolean hasVersion(Version version)
	{
		return versions.contains(version);
	}

	public String getService()
	{
		return service;
	}

	public BrapiCall setService(String service)
	{
		this.service = service;
		return this;
	}

	public List<DataType> getDataTypes()
	{
		return dataTypes.stream().map(DataType::valueOf).collect(Collectors.toList());
	}

	public List<Method> getMethods()
	{
		return methods.stream().map(Method::valueOf).collect(Collectors.toList());
	}

	public List<Version> getVersions()
	{
		return versions.stream().map(Version::valueOf).collect(Collectors.toList());
	}

	public enum DataType
	{
		json("application/json"),
		tsv("text/tsv"),
		flapjack("application/flapjack");

		String type;

		DataType(String type)
		{
			this.type = type;
		}
	}

	public enum Method
	{
		GET,
		POST,
		PUT,
		DELETE
	}

	public enum Version
	{
		ONE_ZERO("1.0"),
		ONE_ONE("1.1"),
		ONE_TWO("1.2"),
		ONE_ZTHREE("1.3"),
		TWO_ZERO("2.0");

		String number;

		Version(String number)
		{
			this.number = number;
		}
	}
}