package trevo.resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import trevo.dto.ProductDto;
import trevo.service.ProductService;


@Path("/product")
public class ProductController {
    @Inject
    ProductService productService;


    @POST
    @Transactional
    public Response register(@RequestBody @Valid ProductDto dto) {
        return productService.register(dto);
    }

    @GET
    public Response list() {
        return productService.list();
    }

//    @DELETE
//    public Response delete(@PathParam Long id) {
//        return productService.delete(id);
//    }
}

