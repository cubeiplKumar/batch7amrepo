// importing the File class
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }

  #feature 301 changes done by Vivek
  public static void sampleMethod(int a, int b) throws ArithmeticException{
        System.out.println("Hello, this is sample method");
        int c = a/b; //  int c = 4/2 which gets calculated as 2 
        System.out.println("c:"+c); // c: 2
   }



  #feature300 new changes done by Developer :Mahender
  // reads all data from input.txt
      sourceFile.read(array);

      // writes all data to newFile
      destFile.write(array);
      System.out.println("The input.txt file is copied to newFile.");

}