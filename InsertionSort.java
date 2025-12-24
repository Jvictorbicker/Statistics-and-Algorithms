package Dominio;

public class InsertionSort {
    private int[] numbers = new int[]{34,45,23,12,56,78};

    public void Sort() {
        for (int i = 0; i < this.numbers.length; i++) {
            int currentNumber = numbers[i];
            int j = i - 1;

            for (j = i - 1; j >= 0 && numbers[j] > currentNumber; j--) {
                if (numbers[j] > currentNumber) {
                    numbers[j+1] = numbers[j];
                }
            }
            numbers[j+1] = currentNumber;
        }
        for (int arr : this.numbers) {
            System.out.println(arr);
        }
    }
    public void main(String[] args) {
        Sort();
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
