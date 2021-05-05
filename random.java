
/* Write a program that creates a Random object with seed 1000 and displays 
the first 100 random integers between 1 and 49 using the nextInt (49) method. */

import java.util.Random;

class random {
 public static void main(String[] args) {

      // random object with seed 1000 created
      Random random = new Random(1000);

      System.out.println();

      // printing 100 numbers
      for (int i = 0; i < 100; i++) {

          // formatting the number such that it is between 1 and 49
          System.out.format("%5d",random.nextInt(49));
          
          // printing a new line after every 10 numbers
          if((i+1)%10==0) {
              System.out.println();
          }
      }
  }
}