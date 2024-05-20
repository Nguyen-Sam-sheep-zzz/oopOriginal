package Buoi6.StaticMethod.BaiTap;

import java.util.ArrayList;

public class Product {

    protected String name;
    protected long price;
    protected int theNumberOfProducts;

    public Product(String name, long price, int theNumberOfProducts) {
        this.name = name;
        this.price = price;
        this.theNumberOfProducts = theNumberOfProducts;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheNumberOfProducts() {
        return theNumberOfProducts;
    }

    public void setTheNumberOfProducts(int theNumberOfProducts) {
        this.theNumberOfProducts = theNumberOfProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name: '" + name + '\'' +
                ", price: " + price +
                ", theNumberOfProducts: " + theNumberOfProducts +
                '}';
    }
}
