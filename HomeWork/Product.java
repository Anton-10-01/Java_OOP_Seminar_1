package Java.Java_OOP_Seminar_1.HomeWork;


public class Product {
    private String nameProduct;
    private Double price;
    private Double rating;
    public Product() {
    }

    public Product(String nameProduct, Double price, Double rating) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }
    
    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getRating() {
        return rating;
    }
    public void setRating(Double rating) {
        this.rating = rating;
    }

}
