package Java.Java_OOP_Seminar_1.HomeWork;

import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Ножи");

        category1.addProducts(new Product("Нож", 125.5, 4.5));

        Category category2 = new Category("Одежда");
        
        category2.addProducts(new Product("Шуба", 514.6, 4.2));

        category2.addProducts(new Product("Штаны", 240.5, 4.0));

        Shop shop = new Shop();
        shop.addCategory(category1);
        shop.addCategory(category2);

        shop.printAllProducts();

        User user1 = new User("Anton", "12345");
        user1.getBasket().addProducts(category1.getProducts().get(0));

        User user2 = new User("Vladimir", "12fd45");
        user2.getBasket().addProducts(category2.getProducts().get(1));

        category1.getProducts().remove(0);
        category2.getProducts().remove(1);

        System.out.println("Корзина: " + user1.getLogin());
        ArrayList<Product> userProduct1 = user1.getBasket().getProducts();
        for (Product product: userProduct1) {
            System.out.println("Товар: " + product.getNameProduct()
                                +"\nСтоимость: " + product.getPrice()
                                + "\nРейтинг: " + product.getRating());
        }

        System.out.println("-----------------");
        System.out.println("Корзина: " + user2.getLogin());

        ArrayList<Product> userProduct2 = user2.getBasket().getProducts();
        for (Product product: userProduct2) {
            System.out.println("Товар: " + product.getNameProduct()
                                +"\nСтоимость: " + product.getPrice()
                                + "\nРейтинг: " + product.getRating());
        }

        shop.printAllProducts();
    }
}