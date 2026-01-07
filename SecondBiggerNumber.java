package Dominio;

public class SecondBiggerNumber {
    private int [] numbers = new int[]{45,12,23,45,67,12};

    public void Result() {
        for (int i = 0; i < this.numbers.length; i++) {
            int index = i;

            for (int j = i + 1; j < this.numbers.length; j++) {
                if (numbers[index] > numbers[j]) {
                    index = j;
                }
            }
            int aux = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = aux;
        }
        for (int i = this.numbers.length - 2; i >= 0; i++) {
            if (numbers[i] < numbers[numbers.length - 1]) {
                System.out.println("second biggest number is: " + numbers[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        SecondBiggerNumber arr = new SecondBiggerNumber();

        arr.Result();
    }
}
/*
  1) Sort the array in ascending order.

  2) Take the last element of the array,
     which represents the largest value.

  3) Iterate through the array from the end to the beginning.

  4) Compare each element with the largest value.

  5) When a value smaller than the largest one is found,
     this value is the second largest number.

  6) Stop the loop once the second largest value is found.
*/