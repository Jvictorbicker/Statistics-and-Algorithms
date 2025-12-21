package Dominio;

public class SecondBiggerNumber {
    private int [] numbers = new int[]{45,12,23,45,67,12};

    public void Result() {
        for (int i = 0; i < this.numbers.length; i++) {
            for (int j = 0; j < this.numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }
        for (int i = this.numbers.length - 1; i >= 0; i--) {
            if (numbers[numbers.length - 1] > numbers[i]) {
                System.out.println("Segundo maior: " + numbers[i]);
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