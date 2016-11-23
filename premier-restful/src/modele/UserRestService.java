package modele;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestService {

	
	
	@GET
	@Path("{nom1}")
	@Produces({MediaType.TEXT_PLAIN+ ";charset=UTF-8"})
	public Response bonjour (@PathParam("nom1") String nom){
		
		return Response.status(200).entity("Bonjour Madame , Monsieur "+ nom).build();
	
	}
			
		
		
}
