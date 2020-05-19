/**
 * IllegalArgumentExceptionThrown
 * 
 * This class will throw a IllegalArgumentException for a random value less than
 * 2
 * 
 * @author sDantzler
 */
public class IllegalArgumentExceptionThrown {

   public static void main(String[] args) throws IllegalArgumentException {

      // assign a double value to a random number between 1 and 2
      double x = Math.random() + 1;

      // if the value is less than 2 throw an illegal argument exception
      if (x < 2)
         throw new IllegalArgumentException() {
         };

   }// end main method

}// end class IllegalArgumentExceptionThrown
