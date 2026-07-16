import java.util.ArrayList;
import java.util.List;

public class LowerBoundedType {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addNumbers(intList);      // Valid
        addNumbers(numberList);   // Valid
        addNumbers(objectList);   // Valid

        System.out.println("Integer List: " + intList);
        System.out.println("Number List: " + numberList);
        System.out.println("Object List: " + objectList);
    }
}