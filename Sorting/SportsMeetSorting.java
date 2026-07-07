import java.util.Arrays;
import java.util.Random;

public class SportsMeetSorting {
    static int bubbleSort(int[] arr) {
        int swaps = 0;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.println("Best Case: Array was already sorted.");
                break;
            }
        }
        return swaps;
    }


    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void bubbleTrace() {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("\nBubble Sort Passes:");
        System.out.println("Original: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    static void insertionTrace() {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("\nInsertion Sort Passes:");
        System.out.println("Original: " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] scores = new int[50];
        for (int i = 0; i < 50; i++) {
            scores[i] = random.nextInt(101); // Scores 0-100
        }
        System.out.println("Original Scores:");
        System.out.println(Arrays.toString(scores));

        int[] bubbleArray = scores.clone();
        int swaps = bubbleSort(bubbleArray);

        System.out.println("\nBubble Sorted Scores:");
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println("Total Swaps = " + swaps);

        int[] insertionArray = scores.clone();
        insertionSort(insertionArray);

        System.out.println("\nInsertion Sorted Scores:");
        System.out.println(Arrays.toString(insertionArray));

        System.out.println("\nTop 3 Medalists:");
        System.out.println("Gold   : " + insertionArray[49]);
        System.out.println("Silver : " + insertionArray[48]);
        System.out.println("Bronze : " + insertionArray[47]);

        bubbleTrace();
        insertionTrace();
    }
}