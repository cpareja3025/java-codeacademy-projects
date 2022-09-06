import java.util.Scanner;
public class Introduction {
  public static void main( String[] args ) {
    Scanner x = new Scanner(System.in);
    System.out.println("what is your name");
    String userName = x.next();
    System.out.printf("Hello %s! It's nice to meet you.", userName);


    
  }
}
