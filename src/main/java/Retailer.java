import java.util.ArrayList;
import java.util.List;

public class Retailer {
    List<Product> productList = new ArrayList<>();
    String name;

    public Retailer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }
}
