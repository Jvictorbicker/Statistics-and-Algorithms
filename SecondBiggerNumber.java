package Dominio;

public class SecondBiggerNumber {
    private int [] numbers = new int[]{45,12,23,45,67,12};

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
        for (int i = this.numbers.length  - 1; i >= 0; i--) {
            int biggestNumber = numbers[this.numbers.length - 1];

            if (biggestNumber > numbers[i]) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        SecondBiggerNumber arr = new SecondBiggerNumber();

        arr.Result();
    }
}
