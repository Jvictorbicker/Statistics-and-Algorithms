package Dominio;

public class BinarySearch {
    private static int[] numbers = new int[]{34,45,23,12,56,78};

    public static void Sort() {
        for (int i = 1; i < numbers.length; i++) {
            int sorted = numbers[i];
            int j = i - 1;

            for (j = i - 1; j >= 0 && numbers[j] >= sorted; j--) {
                numbers[j + 1] = numbers[j];
            }
            numbers[j + 1] = sorted;
        }
    }
    public static int Search(int value) {
        Sort();

        int start = 0;
        int end = numbers.length - 1;

        while (end >= start) {
            int mid = (start + end) / 2;

            if (numbers[mid] == value) {
                return mid;
            } else if (numbers[mid] > value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int Search2(int value, int start, int end) {
        if (end >= start) {
            int mid = (start + end) / 2;

            if (numbers[mid] == value) {
                return mid;
            } else if (numbers[mid] > value) {
                return Search2(value, start, mid - 1);
            } else {
                return Search2(value,mid + 1, end);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Search(45));

        Sort();
        System.out.println(Search2(45, 0, numbers.length - 1));
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