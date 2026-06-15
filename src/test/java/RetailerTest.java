import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetailerTest {
    //As a retailer on Northern Store
    //I want to be able to advertise items with item description, price, and the environmental impact of buying the product
    //So that I can explain everything about the item before its purchased
    @Test
    void allowRetailerToAdvertiseItemWithDescriptionPriceAndImpact() {
        //Arrange
        Retailer goodGroceries = new Retailer("Good Groceries");

        //Act
        goodGroceries.addProduct(new Product("bananas","deforestation decrease",6));

        //Assert
        assertEquals("bananas",goodGroceries.productList.getFirst().item);
        assertEquals("deforestation decrease",goodGroceries.productList.getFirst().impact);
        assertEquals(6,goodGroceries.productList.getFirst().price);
    }
}
