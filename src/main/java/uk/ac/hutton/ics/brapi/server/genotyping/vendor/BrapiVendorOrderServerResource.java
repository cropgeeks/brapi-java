package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.vendor.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiVendorOrderServerResource
{
	BaseResult<ArrayResult<VendorOrder>> getVendorOrder(@QueryParam("orderId") String orderId,
														@QueryParam("submissionId") String submissionId)
		throws SQLException, IOException;

	BaseResult<ArrayResult<VendorOrder>> postVerndorOrders(VendorOrder[] newVendorOrders)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Plate>> getVendorOrderByIdPlates(@PathParam("orderId") String orderId)
		throws SQLException, IOException;

	BaseResult<ArrayResult<OrderResult>> getVendorOrderByIdResults(@PathParam("orderId") String orderId)
		throws SQLException, IOException;

	BaseResult<List<String>> getVendorOrderByIdStatus(@PathParam("orderId") String orderId)
		throws SQLException, IOException;
}
