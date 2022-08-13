package heroku.dto.response;

import heroku.model.Product;

public class ProductResponse {

    private Long id;
    private String name;

    public ProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
