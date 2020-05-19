/**
 * NullPointerExceptionCatch
 * 
 * This class will catch a NullPointerException for the incorrect assignment of
 * a primitive variable to a object null pointer assignment
 * 
 * @author sDantzler
 */
public class NullPointerExceptionCatch {

   public static void main(String[] args) throws NullPointerException {

      try {
         // initialized object variable x is set to null
         Integer x = null;

         // uninitialized integer variable y
         int y;

         // attempting to set primitive variable to a object null pointer
         System.out.print(y = x);

      } // end try
      catch (NullPointerException e) {
         System.out.println("Exception caught: " + e);
      } // end catch 1
      catch (Exception e) {
         System.out.println("Exception caught: " + e);
      } // end catch 2
   }// end main method

}// end class NullPointerExceptionCatch
