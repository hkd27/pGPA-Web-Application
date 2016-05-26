package book;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.mahout.cf.taste.common.TasteException;

@Path("/book")
public class book {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hello/{v1}")
	public String SayHello(@PathParam("v1") String v1) {
	
		
		return "ANS "+v1;
		
	}
		
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/course/{v1}/{v2}")
	public String SayAdd(@PathParam("v1") int v1,@PathParam("v2") String v2) throws TasteException, IOException{
		App in=new App();
	String test=(in.datap(v1,v2)).toString();
		
		return test;
		
	}
		

		@GET
			@Produces(MediaType.TEXT_PLAIN)
			@Path("/excel/{v1}/{v2}")
			public String SayExcel(@PathParam("v1") int v1,@PathParam("v2") String v2) throws TasteException, IOException{
				App in=new App();

				ArrayList<String> courses=new ArrayList();
				courses=(in.dataexcel(v1,v2));

				String test=(in.dataexcel(v1,v2)).toString();
				return test;
				
			}
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		@Path("/graph/{v1}")
		public String SayGraph(@PathParam("v1") String v1) throws TasteException, IOException{
			App in=new App();

			ArrayList<String> count=new ArrayList<String>();
			count=(in.datagraph(v1));	

			String test=count.toString();
			return test;
			
		}

		
		
}
