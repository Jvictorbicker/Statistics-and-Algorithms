package Dominio;

public class AverageTwoSortedArr {
    static double[] arr1 = new double[]{78,89,23,12,34,45};
    static double[] arr2 = new double[]{89,67,45,67,23,12,78};

    public static void Sort(int[] arr) {
        for (int i = 1; i < arr.length; i ++) {
            int sorted = arr[i];
            int j = i - 1;

            for (j = i - 1; j >= 0 && arr[j] >= sorted; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = sorted;
        }
    }
    public static double Average(double[] primeiro, double[] segundo) {
        double soma1 = 0;
        double tamanho = 0;
        tamanho += primeiro.length;
        tamanho += segundo.length;

        for (double sum : primeiro) {
            soma1 += sum;
        }
        for (double sum : segundo) {
            soma1 += sum;
        }
        return soma1 /tamanho;
    }
}
