package Java.Java_OOP_Seminar_1.HomeWork;

import java.util.ArrayList;

public class Category {
    protected String nameCategory;
    protected ArrayList<String> products;

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

    public ArrayList<String> getArrProduct() {
        return products;
    }

    public void addProducts(String product) {
        this.products.add(product);
    }

    @Override
    public String toString() {
        return "Category [nameCategory=" + nameCategory + ", products=" + products + "]";
    }

}
