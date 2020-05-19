/**
 * ArrayIndexOutOfBoundsExceptionThrown
 * 
 * This class will throw an ArrayIndexOutOfBoundsException for the attempting to
 * call a value out of bounds of an array
 * 
 * @author sDantzler
 */
public class ArrayIndexOutOfBoundsExceptionThrown {

   public static void main(String[] args)
         throws ArrayIndexOutOfBoundsException {

      Integer[] array = { null };

      System.out.println(array[1]);

   }// end main method

}// end class ArrayIndexOutOfBoundsExceptionThrown
