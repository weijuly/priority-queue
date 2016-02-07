package com.weijuly.develop.pq.grizzly;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class PriorityQueueGrizzlyServer {

	public static final String BASE_URI = "http://localhost:8080/pq/queue";

	public static HttpServer create() {
		final ResourceConfig rc = new ResourceConfig().packages("com.weijuly.develop.pq");
		return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
	}

	public static void main(String[] args) throws IOException {
		final HttpServer server = create();
		System.out.println(String.format(
				"Jersey app started with WADL available at " + "%sapplication.wadl\nHit enter to stop it...",
				BASE_URI));
		System.in.read();
		server.shutdownNow();
	}

}
