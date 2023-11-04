package Java.Java_OOP_Seminar_1.HomeWork;

import java.util.ArrayList;

public class Category {
    protected String nameCategory;
    protected ArrayList<String> arrProduct;

    public Category(String nameCategory, ArrayList<String> arrProduct) {
        this.nameCategory = nameCategory;
        this.arrProduct = arrProduct;
    }

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;

    }

    public Category() {

    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ArrayList<String> getArrProduct() {
        return arrProduct;
    }

    public void setArrProduct(ArrayList<String> arrProduct) {
        this.arrProduct = arrProduct;
    }

    @Override
    public String toString() {
        return "Category [nameCategory=" + nameCategory + ", arrProduct=" + arrProduct + "]";
    }

}
