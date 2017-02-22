package com.bestbuy.sec;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
public class Try {

	@GET
	@Path("/helloworld")
	@Produces(MediaType.TEXT_HTML)
	public String helloWorld(){
		return "HelloWorld";
	}
}
