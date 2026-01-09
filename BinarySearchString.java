package Dominio;

public class BinarySearchString {
    private static String[] names = new String[]{"pedro", "ana", "bia", "joao", "julia"};

    public static void Sort() {
        for (int i = 1; i < names.length; i++) {
            int j = i - 1;
            String sorted = names[i];

            for (j = i - 1; j >= 0 && names[j].compareTo(sorted) > 0; j--) {
                names[j+1] = names[j];
            }
            names[j+1] = sorted;
        }
    }

    public static int BinarySearch(String target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (names[mid].equals(target)) {
                return mid;
            } else if (names[mid].compareTo(target) > 0) {
                return BinarySearch(target, start, mid -1);
            } else {
                return BinarySearch(target, mid + 1, end);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Sort();
        System.out.println(BinarySearch("ana", 0, names.length - 1));
    }
}
