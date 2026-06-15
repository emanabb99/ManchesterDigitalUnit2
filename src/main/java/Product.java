public class Product {
    String item;
    String impact;
    int price;

    public Product(String item, String impact, int price) {
        this.item = item;
        this.impact = impact;
        this.price = price;
    }

    public String toString() {
        return item + " - " + impact + " - " + " £" + price;
    }
}
