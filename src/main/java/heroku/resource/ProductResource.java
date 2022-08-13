package heroku.resource;

import heroku.dto.request.ProductRequest;
import heroku.service.ProductService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/products")
public class ProductResource {

    @Inject
    ProductService service;

    @POST
    public Response create(@Valid ProductRequest request) {
        return Response.created(null).entity(service.create(request)).build();
    }

    @GET
    public Response all() {
        return Response.ok(service.all()).build();
    }
}
