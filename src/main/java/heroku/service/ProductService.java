package heroku.service;

import heroku.dto.request.ProductRequest;
import heroku.dto.response.ProductResponse;
import heroku.model.Product;
import heroku.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ProductService {

    @Inject
    ProductRepository repository;

    @Transactional
    public ProductResponse create(ProductRequest request) {
        var product = new Product();
        product.setName(request.getName());
        repository.persist(product);
        var productResponse = new ProductResponse(product);
        return productResponse;
    }

    public List<ProductResponse> all() {
        return repository.listAll().stream().map(ProductResponse::new).collect(Collectors.toList());
    }
}
