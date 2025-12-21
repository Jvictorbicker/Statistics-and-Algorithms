package Dominio;

public class BubbleSort {
    private int[] numbers = new int[]{45,12,23,45,67,12};

    public void Result() {
        for (int i = 0; i < this.numbers.length; i++) {
            for (int j = 0; j < this.numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
/*
  1) Iterate through the array multiple times using two loops.

  2) Compare two adjacent elements at positions j and j + 1.

  3) If the element at position j is greater than the element
     at position j + 1, a swap is required.

  4) Temporarily store the value at position j.

  5) Move the value at position j + 1 to position j.

  6) Place the stored value into position j + 1.

  7) Repeat this process until the array is fully sorted.
*/