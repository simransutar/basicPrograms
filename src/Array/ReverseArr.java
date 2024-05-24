package Array;

import static Array.ReverseArr.printArray;

public class ReverseArr {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original array: ");
        printArray(numbers);

        reverseArray(numbers);

        System.out.println("Reversed array: ");
        printArray(numbers);
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move to the next pair of elements
            start++;
            end--;
        }
    }
        static void printArray(int[]arr){
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


