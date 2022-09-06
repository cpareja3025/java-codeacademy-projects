import java.io.*;
public class PracticewithIOFiles {
    public static void main(String[] args) throws IOException{
        String path = "/Users/cpare/Downloads/HelloCarlos.txt";

        FileInputStream input = new FileInputStream(path);

        int i = 0;

        while((i = input.read()) != -1) {
            System.out.print((char)i);

        }
        input.close();


    }
    
}
