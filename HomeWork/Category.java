package Java.Java_OOP_Seminar_1.HomeWork;

import java.util.ArrayList;

public class Category {
    private String nameCategory;
    private ArrayList<Product> products;

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
        this.products = new ArrayList<>();
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }


}
