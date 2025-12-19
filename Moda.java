package Dominio;

public class Moda {
    private int[] number = new int[]{23,13,34,12,12,76,78};

    public void Result() {
        int moda = 0;
        int moreAppeared = 0;

        for (int i = 0; i < this.number.length; i++) {
            int counter = 0;
            for (int j = 0; j < this.number.length; j++) {
                if (number[i] == number[j]) {
                    counter++;
                }
            }
            if (counter > moreAppeared) {
                moreAppeared = counter;
                moda = number[i];
            }
        }
        System.out.println("moda " + moda);
    }
    public static void main(String[] args) {
        Moda number = new Moda();

        number.Result();
    }
}

/* Run through the array
   start the counter
   run again through the array
   compare the first run and the second
   if is equal, then add to counter
   compare counter to the most shown number
   add counter to most shown
   add the number that repeat itself to moda
   then print
 */
