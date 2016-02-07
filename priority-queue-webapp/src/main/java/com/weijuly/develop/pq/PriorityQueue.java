package com.weijuly.develop.pq;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pq")
public class PriorityQueue {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/topics")
	public String dequeue() {
		return "fact";
	}

	@GET
	public String queue() {
		return "dack";
	}
}
