package Dominio;

public class SelectionSort {
    private int[] numbers = new int[]{45,12,23,45,67,12};

    public void Sort() {
        for (int i = 0; i < this.numbers.length; i++) {
            int smallerIndex = i;
            for (int j = i + 1; j < this.numbers.length; j++) {
                if (numbers[smallerIndex] > numbers[j]) {
                    smallerIndex = j;
                }
            }
            int aux = numbers[i];
            numbers[i] = numbers[smallerIndex];
            numbers[smallerIndex] = aux;
        }
        for (int numbers : this.numbers) {
            System.out.println(numbers);
        }
    }
    public void main(String[] args) {
        Sort();
    }
}
