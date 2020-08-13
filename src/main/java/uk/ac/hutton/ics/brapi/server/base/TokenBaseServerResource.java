package uk.ac.hutton.ics.brapi.server.base;

import org.restlet.resource.*;

import java.sql.*;
import java.util.Objects;

import uk.ac.hutton.ics.brapi.resource.base.TokenBaseResult;

public abstract class TokenBaseServerResource extends ServerResource
{
	protected static final String PARAM_PAGE_SIZE    = "pageSize";
	protected static final String PARAM_CURRENT_PAGE = "pageToken";

	// TODO: do we want to configure this value in the environment somehow (e.g. properties file etc...)
	protected int pageSize    = Integer.MAX_VALUE;
	protected int currentPage = 0;

	@Override
	public void doInit()
	{
		super.doInit();

		String pageSize = getQueryValue(PARAM_PAGE_SIZE);
		if (pageSize != null)
		{
			try
			{
				this.pageSize = Integer.parseInt(getQueryValue(PARAM_PAGE_SIZE));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		String page = getQueryValue(PARAM_CURRENT_PAGE);
		if (page != null)
		{
			try
			{
				this.currentPage = Integer.parseInt(getQueryValue(PARAM_CURRENT_PAGE));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
