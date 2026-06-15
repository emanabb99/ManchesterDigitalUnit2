import java.util.List;

public class Consumer {

    public List<Product> browse(Retailer retailer) {
        return retailer.productList;
    }
}
