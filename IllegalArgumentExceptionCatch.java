/**
 * IllegalArgumentExceptionCatch
 * 
 * This class will catch a IllegalArgumentException for a random value less than
 * 2
 * 
 * @author sDantzler
 */
public class IllegalArgumentExceptionCatch {

   public static void main(String[] args) throws IllegalArgumentException {

      try {
         // assign a double value to a random number between 1 and 2
         double x = Math.random() + 1;

         // if the value is less than 2 throw an illegal argument exception
         if (x < 2)
            throw new IllegalArgumentException() {
            };// end if
      } // end try
      catch (IllegalArgumentException i) {
         System.out.println("Exception caught: " + i);
      } // end catch
   }// end main method

}// end class IllegalArgumentExceptionCatch
