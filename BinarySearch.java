package Dominio;

public class BinarySearch {
    private static int[] numbers = new int[]{34,45,23,12,56,78};

    public static void Sort() {
        for (int i = 1; i < numbers.length; i++) {
            int sorted = numbers[i];
            int j = i - 1;

            for (j = i -1; j >= 0 && numbers[j] >= sorted; j--) {
                numbers[j+1] = numbers[j];
            }
            numbers[j + 1] = sorted;
        }
    }
    public static int search(int value) {
        Sort();

        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (value == numbers[mid]) {
                return mid;
            } else if (numbers[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int search2(int value, int start, int end) {
        if (start > end) {
            return - 1;
        }
        int mid = (start + end) / 2;

        if (numbers[mid] == value) {
            return mid;
        } else if (numbers[mid] < value) {
            return search2(value, mid + 1, end);
        } else {
            return search2(value,start,mid - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(search(45));

        Sort();
        System.out.println(search2(45, 0, numbers.length - 1));
    }
}

/*
  Iterate over the array starting from index 1
  Treat the element at index 0 as already sorted
  Store the current element in a temporary variable
  Start index j from the previous position (i - 1)
  Compare the current element with elements to its left
  While elements on the left are greater, shift them one position to the right
  Stop when the correct position is found or the beginning of the array is reached
  Insert the stored element into its correct position
*/