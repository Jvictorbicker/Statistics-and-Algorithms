package Dominio;

public class BinarySearchString {
    private static String[] names = new String[]{"Ana", "pedro", "joao","lukas"};

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
        if (start <= end) {
            int mid = (start + end) / 2;

            if (names[mid].equals(value)) {
                return mid;
            } else if (names[mid].compareTo(value) > 0) {
                return Search(value, start, mid - 1);
            } else {
                return Search(value, mid + 1, end);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Sort();
        System.out.println(Search("luk", 0, names.length - 1));
    }
}