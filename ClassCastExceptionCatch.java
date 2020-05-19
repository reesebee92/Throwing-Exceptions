/**
 * ClassCastExceptionCatch
 * 
 * This class will catch a ClassCastException for the incorrect casting of an
 * Object into a String object
 * 
 * @author sDantzler
 */
public class ClassCastExceptionCatch {

   public static void main(String[] args) throws ClassCastException {

      try {
         // create a new object called x
         Object x = new Object();

         // create a new String object assigned to "5"
         String z = "5";

         // attempting to cast an Object into a String
         z = (String) x;
      } // end try
      catch (ClassCastException c) {
         System.out.println("Exception caught: " + c);
      } // end catch 1
      catch (Exception e) {
         System.out.println("Exception caught: " + e);
      } // end catch 2

   }// end main method

}// end class ClassCastExceptionCatch
