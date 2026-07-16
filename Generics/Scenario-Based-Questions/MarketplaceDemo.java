import java.util.*;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println(name + " | " + category.getCategoryName() + " | ₹" + price);
    }
}

public class MarketplaceDemo {
    public static <T extends Category> void applyDiscount(Product<T> product, double percent) {
        double newPrice = product.getPrice() - (product.getPrice() * percent / 100);
        product.setPrice(newPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming",800,new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt",1200,new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone",25000,new GadgetCategory());

        applyDiscount(book,20);
        applyDiscount(shirt,10);
        applyDiscount(phone,5);

        book.display();
        shirt.display();
        phone.display();
    }
}