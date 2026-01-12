package Dominio;

public class BinarySearchString {
    static String[] names = new String[]{"pedro", "ana","julia","bia","isa"};

    public static void Sort() {
        for (int i = 1; i < names.length; i++) {
            String sorted = names[i];
            int j = i - 1;

            for (j = i - 1; j >= 0 && names[j].compareTo(sorted) > 0; j--) {
                names[j + 1] = names[j];
            }
           names[j + 1] = sorted;
        }
    }
    public static int Search(String value, int start, int end) {
        Sort();
        if (start <= end) {
            int mid = (start + end) / 2;

            if (value.equals(names[mid])) {
                return mid;
            } else if (value.compareTo(names[mid]) > 0) {
                return Search(value, mid + 1, end);
            } else {
                return Search(value, start, mid - 1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(Search("julia", 0,names.length - 1));
    }
}