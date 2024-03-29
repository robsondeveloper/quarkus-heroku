package heroku.dto.request;

import javax.validation.constraints.NotEmpty;

public class ProductRequest {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
