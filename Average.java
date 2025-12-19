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

    /* loop through the array
       sum the array
       return the sum divided for the number length
     */
}