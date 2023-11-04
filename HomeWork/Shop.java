package Java.Java_OOP_Seminar_1.HomeWork;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }
    

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void printAllProducts() {
        for(Category category: categories) {
            System.out.println("Категория: " + category.getNameCategory());
            ArrayList<Product> products = category.getProducts();
                for(Product product: products){
                    System.out.println("Товар: " + product.getNameProduct()
                                        + "\nСтоимость: " + product.getPrice()
                                        + "\nРейтинг: " + product.getRating());
                }
                System.out.println("-----------------");
        }
    }
}
