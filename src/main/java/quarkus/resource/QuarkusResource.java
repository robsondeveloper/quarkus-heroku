package quarkus.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import quarkus.model.Quarkus;
import quarkus.repository.QuarkusRepository;

@Path("/quarkus")
public class QuarkusResource {

	@Inject
	QuarkusRepository repository;

	@GET
	public List<Quarkus> listar() {
		return repository.listAll();
	}

}
