package uk.ac.hutton.ics.brapi.server.base;

import jakarta.ws.rs.*;

import java.math.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseServerResource extends ContextResource
{
	@DefaultValue("2147483647")
	@QueryParam("pageSize")
	protected int pageSize;

	@DefaultValue("0")
	@QueryParam("page")
	protected int page;

	private static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	protected synchronized Timestamp toTimestamp(String dateTime)
	{
		try
		{
			return new Timestamp(SDF.parse(dateTime).getTime());
		}
		catch (Exception e)
		{
			return null;
		}
	}

	protected synchronized String fromTimestamp(Timestamp dateTime)
	{
		try
		{
			return SDF.format(new Date(dateTime.getTime()));
		}
		catch (Exception e)
		{
			return null;
		}
	}

	protected BigDecimal toBigDecimal(Double value)
	{
		try
		{
			BigDecimal result = new BigDecimal(value, MathContext.DECIMAL64);
			result = result.setScale(10, RoundingMode.HALF_UP);
			return result;
		}
		catch (Exception e)
		{
			return null;
		}
	}
}
