class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class TypeOfParameters {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Java");
        System.out.println(stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(100);
        System.out.println(intBox.getItem());
    }
}