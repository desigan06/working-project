import java.util.Arrays;

class ArrayOperations {
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);
        int[] descending = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            descending[i] = arr[arr.length - 1 - i];
        }
        return descending;
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 7, 89, 34};

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(array)));
        System.out.println("Largest Number: " + findLargest(array));
        System.out.println("Array in Descending Order: " + Arrays.toString(sortDescending(array)));
    }
}
