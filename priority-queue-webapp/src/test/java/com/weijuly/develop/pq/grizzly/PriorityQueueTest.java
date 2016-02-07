package com.weijuly.develop.pq.grizzly;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PriorityQueueTest {

	private HttpServer server;
	private WebTarget target;

	@Before
	public void setup() throws Exception {
		server = PriorityQueueGrizzlyServer.create();
		Client client = ClientBuilder.newClient();
		target = client.target(PriorityQueueGrizzlyServer.BASE_URI);
	}

	@Test
	public void test() {
		String response = target.path("admin/topics").request().get(String.class);
		System.out.println(response);
		Assert.assertEquals("joke", response);

	}

	@After
	public void teardown() {
		server.shutdownNow();
	}

}
