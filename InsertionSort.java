package Dominio;

public class InsertionSort {
    private int[] numbers = new int[]{34,45,23,12,56,78};

    public void Sort() {
        for (int i = 1; i < this.numbers.length; i++) {
            int currentNumber = numbers[i];
            int j = i - 1;

            for (j = i - 1; j >= 0 && numbers[j] > currentNumber; j--) {
                if (numbers[j] > currentNumber) {
                    numbers[j+1] = numbers[j];
                }
            }
            numbers[j+1] = currentNumber;
        }
        for (int numbers : this.numbers){
            System.out.println(numbers);
        }
    }
    public void main(String[] args) {
        Sort();
    }
}
