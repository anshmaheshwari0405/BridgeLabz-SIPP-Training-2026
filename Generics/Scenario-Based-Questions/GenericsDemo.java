import java.util.*;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println(first + " " + second);
    }
}

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }
}

class Repository<T> {
    ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        System.out.println(data);
    }
}

public class GenericsDemo {
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T value : arr) {
            if (value.compareTo(max) > 0)
                max = value;
        }
        return max;
    }

    public static void print(List<?> list) {
        for (Object obj : list)
            System.out.print(obj + " ");
    }

    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("Age",21);
        p.display();

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());

        Integer arr[] = {5,9,2,8};
        System.out.println(findMax(arr));

        Repository<String> repo = new Repository<>();
        repo.add("Laptop");
        repo.add("Mobile");
        repo.display();

        List<String> list = Arrays.asList("A","B","C");
        print(list);
    }
}