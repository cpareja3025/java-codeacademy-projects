import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args){

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Carlos");
        list1.add("Adrie");
        list1.add("Lakers");
        list1.add("UCSD");
        System.out.println(list1.toString());
        list1.set(1,"Home");
        System.out.println(list1.toString());
        System.out.println("The size of this ArrayList is " + list1.size());
        System.out.println(list1.get(2));
        System.out.println(list1.indexOf("UCSD"));

    }
    
}
