package Java.Java_OOP_Seminar_1.HomeWork;

import java.util.ArrayList;

public class Basket extends Product{
    ArrayList<String> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void addProducts (String product) {
        products.add(product);
    }
}
