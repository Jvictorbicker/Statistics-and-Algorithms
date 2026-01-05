package Dominio;

public class BinarySearch {
    private static int[] numbers = new int[]{34,45,23,12,56,78};

    public static void Sort() {
        for (int i = 1; i < numbers.length; i++) {
            int sorted = numbers[i];
            int j = i - 1;

            for (j = i - 1; j >= 0 && numbers[j] >= sorted; j--) {
                numbers[j+1] = numbers[j];
            }
            numbers[j+1] = sorted;
        }
    }
    public static int search(int number) {
        Sort();

        int start = 0;
        int end = numbers.length - 1;

        while (end >= start) {
            int mid = (start + end) / 2;

            if (numbers[mid] == number) {
                return mid;
            } else if (numbers[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(42));
    }
}
