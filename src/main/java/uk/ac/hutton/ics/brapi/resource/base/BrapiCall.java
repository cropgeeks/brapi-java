package uk.ac.hutton.ics.brapi.resource.base;

import java.util.*;
import java.util.stream.Collectors;

public class BrapiCall
{
	private List<String> contentTypes = new ArrayList<>();
	private List<String> dataTypes		= new ArrayList<>();
	private List<String> methods      = new ArrayList<>();
	private String       service;
	private List<String> versions     = new ArrayList<>();

	public BrapiCall()
	{
	}

	public BrapiCall(String service)
	{
		this.service = service;
	}

	public BrapiCall addDataType(DataType dataType)
	{
		dataTypes.add(dataType.type);
		return this;
	}

	public BrapiCall addContentType(ContentType contentType)
	{
		contentTypes.add(contentType.type);
		return this;
	}

	public BrapiCall addMethod(Method method)
	{
		methods.add(method.name());
		return this;
	}

	public BrapiCall addVersion(Version version)
	{
		versions.add(version.number);
		return this;
	}

	public boolean hasDataType(DataType dataType)
	{
		return dataTypes.contains(dataType.getType());
	}

	public boolean hasContentType(ContentType contentType)
	{
		return contentTypes.contains(contentType.getType());
	}

	public boolean hasMethod(Method method)
	{
		return methods.contains(method.name());
	}

	public boolean hasVersion(Version version)
	{
		return versions.contains(version.getNumber());
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

	public List<ContentType> getContentTypes()
	{
		return contentTypes.stream().map(ContentType::getFromString).collect(Collectors.toList());
	}

	public List<DataType> getDataTypes()
	{
		return dataTypes.stream().map(DataType::getFromString).collect(Collectors.toList());
	}

	public List<Method> getMethods()
	{
		return methods.stream().map(Method::valueOf).collect(Collectors.toList());
	}

	public List<Version> getVersions()
	{
		return versions.stream().map(Version::getFromString).collect(Collectors.toList());
	}

	public enum ContentType
	{
		json("application/json"),
		tsv("text/tsv"),
		flapjack("application/flapjack");

		String type;

		ContentType(String type)
		{
			this.type = type;
		}

		public static ContentType getFromString(String type)
		{
			for (ContentType ct : ContentType.values())
			{
				if (Objects.equals(ct.type, type)) return ct;
			}

			return null;
		}

		public String getType()
		{
			return type;
		}
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

		public static DataType getFromString(String type)
		{
			for (DataType dt : DataType.values())
			{
				if (Objects.equals(dt.type, type)) return dt;
			}

			return null;
		}

		public String getType()
		{
			return type;
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
		TWO_ZERO("2.0"),
		TWO_ONE("2.1");

		String number;

		Version(String number)
		{
			this.number = number;
		}

		public static Version getFromString(String version)
		{
			for (Version v : Version.values())
				if (Objects.equals(v.number, version)) return v;

			return null;
		}

		public String getNumber()
		{
			return number;
		}
	}
}