import java.io.*;
public class morePracticeIO {
  public static void main(String[] args) throws IOException {
    FileOutputStream file = new FileOutputStream("output3.txt");

    String outputText = "Shadow is here";

    byte[] outputTextBytes = outputText.getBytes();

    file.write(outputTextBytes);

    file.close();


    
  }
}
