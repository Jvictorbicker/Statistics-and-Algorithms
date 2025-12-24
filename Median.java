package Dominio;

public class Median {
    private double [] numbers = new double[]{45,12,23,45,67,12};

    public void Sort() {
        for (int i = 0; i < this.numbers.length; i++) {
            for (int j = 0; j < this.numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    double aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }
    }
    public double Calcular() {
        Sort();
        double soma = 0;

        if (this.numbers.length % 2 == 0) {
            soma += numbers[numbers.length / 2];
            soma += numbers[numbers.length / 2 - 1];

            return soma / 2;
        } else {
            return numbers[numbers.length / 2];
        }
    }

    public static void main(String[] args) {
        Median arr = new Median();

       System.out.println(arr.Calcular());
    }
}

/*
  1) First, sort the array in ascending order.
     This step is necessary because the median is defined
     based on the ordered position of the elements.

  2) Check whether the number of elements in the array
     is even or odd.

  3) If the array length is even:
     - Take the two middle elements of the sorted array.
     - Calculate the average of these two values.
     - This average represents the median.

  4) If the array length is odd:
     - The median is simply the element in the middle
       position of the sorted array.
*/
