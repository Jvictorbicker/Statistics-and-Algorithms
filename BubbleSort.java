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
/* Run twice through the array
   compare if number 1 position is bigger than the second one
   save number [1]
   change  number [1] with number [2]
   give number [1] to number [2]
   https://github.com/Jvictorbicker
 */
