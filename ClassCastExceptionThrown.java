/**
 * ClassCastExceptionThrown
 * 
 * This class will throw a ClassCastException for the incorrect casting of an
 * Object into a String object
 * 
 * @author sDantzler
 */
public class ClassCastExceptionThrown {

   public static void main(String[] args) throws ClassCastException {
      // create a new object called x
      Object x = new Object();

      // create a new String object assigned to "5"
      String z = "5";

      // attempting to cast an Object into a String
      z = (String) x;

   }// end main method

}// end class ClassCastExceptionThrown
