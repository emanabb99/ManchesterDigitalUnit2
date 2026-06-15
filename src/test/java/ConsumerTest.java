import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class ConsumerTest {

    //As a consumer browsing on Northern Store
    //I want to see a selection of ethically sourced and locally produced goods
    //So that I can make conscious purchasing decisions that align with my values
    @Test
    void checkConsumerCanBrowseThroughEthicallySourcedProducts() {
        //Arrange
        Consumer consumer = new Consumer();
        Retailer goodGroceries = new Retailer("Good groceries");
        goodGroceries.addProduct(new Product("bananas","deforestation decrease",6));
        goodGroceries.addProduct(new Product("avocados","water well making",8));


        //Act
        List<Product> products = consumer.browse(goodGroceries);

        //Assert
        assertEquals("bananas",products.get(0).item);
        assertEquals("avocados",products.get(1).item);
    }

    //As a consumer purchasing a product on Northern Store
    //I want to see the story of my item and its community contribution and environmental stewardship
    //So that I can see the difference I’m making from purchasing the item
    @Test
    void checkConsumerCanSeeTheStoryOfItems() {
        //Arrange
        Consumer consumer = new Consumer();
        Retailer goodGroceries = new Retailer("Good groceries");
        goodGroceries.addProduct(new Product("bananas","deforestation decrease",6));
        goodGroceries.addProduct(new Product("avocados","water well making",8));

        //Act
        List<Product> products = consumer.browse(goodGroceries);

        //Assert
        assertEquals("deforestation decrease",products.get(0).impact);
        assertEquals("water well making",products.get(1).impact);
    }

}
