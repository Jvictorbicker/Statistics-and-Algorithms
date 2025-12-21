package Dominio;

public class Moda {
    private int[] number = new int[]{23,13,34,12,12,76,78};

    public void Result() {
        int moda = 0;
        int mostAppeared = 0;

        for (int i = 0; i < this.number.length; i++) {
            int counter = 0;
            for (int j = 0; j < this.number.length; j++) {
                if (number[i] == number[j]) {
                    counter++;
                }
            }
            if (counter > mostAppeared) {
            mostAppeared = counter;
            moda = number[i];
            }
        }
        System.out.println("moda: " + moda);
    }
}

/*
  1) Iterate through the array using the first loop.
     Each element will be considered as a candidate for the mode.

  2) Initialize a counter to track how many times
     the current element appears in the array.

  3) Iterate through the array again using a second loop.
     Compare the current element from the first loop
     with each element from the second loop.

  4) If the values are equal, increment the counter.
     This counts the total occurrences of that element.

  5) Compare the current counter value with the highest
     occurrence count found so far.

  6) If the current counter is greater than the previous maximum:
     - Update the highest occurrence count.
     - Store the current element as the mode.

  7) After finishing the comparisons, print the mode.
*/
