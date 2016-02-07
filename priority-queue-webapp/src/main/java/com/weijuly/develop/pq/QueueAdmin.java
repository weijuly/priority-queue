package com.weijuly.develop.pq;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/admin")
public class QueueAdmin {

	@GET
	@Path("/topics")
	@Produces(MediaType.TEXT_PLAIN)
	public Response topics() {
		return Response.status(Response.Status.OK).entity("joke").build();
	}

	@GET
	@Path("/topics/{topic}")
	@Produces(MediaType.TEXT_PLAIN)
	public String topic(@PathParam("topic") String topic) {
		return "topic: " + topic;
	}

}
