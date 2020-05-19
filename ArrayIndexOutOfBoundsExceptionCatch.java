/**
 * ArrayIndexOutOfBoundsExceptionCatch
 * 
 * This class will catch an ArrayIndexOutOfBoundsException for the attempting to
 * call a value out of bounds of an array
 * 
 * @author sDantzler
 */
public class ArrayIndexOutOfBoundsExceptionCatch {

   public static void main(String[] args)
         throws ArrayIndexOutOfBoundsException {

      try {
         Integer[] array = { null };

         System.out.println(array[1]);
      } // end try
      catch (ArrayIndexOutOfBoundsException a) {
         System.out.println("Exception caught: " + a);
      } // end catch

   }// end main method

}// end class ArrayIndexOutOfBoundsExceptionCatch
