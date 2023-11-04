package Java.Java_OOP_Seminar_1.HomeWork;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        Category category1 = new Category("Ножи");
        //Basket basket = new Basket(null);
        product.setNameProduct("Нож");
        product.setPrice(125.0);
        product.setRating(4.5);

        category1.addProducts(product.getNameProduct());

        Category category2 = new Category("Cloth");
        product.setNameProduct("Шуба");
        product.setPrice(514.0);
        product.setRating(4.2);
        category2.addProducts(product.getNameProduct());

        product.setNameProduct("Штаны");
        product.setPrice(240.5);
        product.setRating(4.0);
        category2.addProducts(product.getNameProduct());

        System.out.println(product);

        System.out.println(category2);

        User user1 = new User();
    }
}