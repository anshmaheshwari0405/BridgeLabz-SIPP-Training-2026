import java.util.*;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Electronics : " + getName());
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Groceries : " + getName());
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    public void display() {
        System.out.println("Furniture : " + getName());
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class WarehouseDemo {
    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            item.display();
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("TV"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));

        displayItems(electronics.getItems());
        displayItems(groceries.getItems());
        displayItems(furniture.getItems());
    }
}