/**
 * NullPointerExceptionThrown
 * 
 * This class will throw a NullPointerException for the incorrect assignment of
 * a primitive variable to a object null pointer assignment
 * 
 * @author sDantzler
 */
public class NullPointerExceptionThrown {

   public static void main(String[] args) throws NullPointerException {

      // initialized object variable x is set to null
      Integer x = null;

      // uninitialized integer variable y
      int y;

      // attempting to set primitive variable to a object null pointer
      System.out.print(y = x);

   }// end main method

}// end class NullPointerExceptionThrown
