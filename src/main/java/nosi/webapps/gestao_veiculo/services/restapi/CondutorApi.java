package nosi.webapps.gestao_veiculo.services.restapi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import nosi.webapps.gestao_veiculo.dao.Condutor;
import java.util.*;

/**
 * cvt00957
 * Dec 1, 2019
 */

@Path("/condutor")
public class CondutorApi {

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Condutor> getCondutores(){
		//https://howtodoinjava.com/jersey/jersey-rest-security/
		Condutor c = new Condutor();
		c.setApplicationName("gestao_veiculo");
		c.setConnectionName("gestao_veiculo_postgresql_1");
		return c.findAll();
	}
}
