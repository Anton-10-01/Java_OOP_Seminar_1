package Java.Java_OOP_Seminar_1.HomeWork;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProducts (Product product) {
        products.add(product);
    }

    public void removeProducts(Product product) {
        products.remove(product);
    }
}
