package uk.ac.hutton.ics.brapi.server.genotyping.map;

import uk.ac.hutton.ics.brapi.resource.base.*;

public interface BrapiMapLinkageGroupServerResource
{
	BaseResult<ArrayResult<LinkageGroup>> getMapLinkageGroups();
}
