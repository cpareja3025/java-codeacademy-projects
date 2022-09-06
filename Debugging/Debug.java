// Different kinds of exceptions

/*
ArithmeticException --> Something went wrong during an arithmetic
operation; for example, division by zero.

NullPointerException --> You tried to access an instance variable 
or invoke a method on an object that is currently null.

ArrayIndexOutOfBoundsException --> The index you are using is either negative
or greater than the last index of the array

FileNotFoundException --> Java didn't find the file it was looking for

*/

public class Debug {

    public static void main(String[] args) {
      
      int width = 0;
      int length = 40;
      
      try {
        
        int ratio = length / width;
        
      } catch (ArithmeticException e) {
        
        System.err.println("ArithmeticException: " + e.getMessage());
        
      }
      
    }
    
  }