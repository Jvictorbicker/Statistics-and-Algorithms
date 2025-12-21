package Dominio;

public class Average {
    private int[] numbers = new int[]{34,45,23,12,56,78};

    public int result() {
        int sum = 0;

        for (int i = 0; i < this.numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / this.numbers.length;
    }

    /*
  1) Iterate through the array using a loop.

  2) Accumulate the sum of all elements in the array.

  3) Divide the total sum by the length of the array.

  4) Return the result as the average value.
*/
}