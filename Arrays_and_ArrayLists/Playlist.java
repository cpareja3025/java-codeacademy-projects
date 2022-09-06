import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlayList = new ArrayList<String>();
        desertIslandPlayList.add("Myself");
        desertIslandPlayList.add("Nav");
        desertIslandPlayList.add("Drake");
        desertIslandPlayList.add("Gunna");
        desertIslandPlayList.add("JCOLE");
        desertIslandPlayList.add("Travis Scott");
        desertIslandPlayList.remove(5);

        int indexA = desertIslandPlayList.indexOf("Nav");
        int indexB  = desertIslandPlayList.indexOf("Drake");

        String tempA = "Nav";

        desertIslandPlayList.set(indexA, "Drake");
        desertIslandPlayList.set(indexB, tempA);



        System.out.println(desertIslandPlayList.toString());
        System.out.println(desertIslandPlayList.size());

    }
    
}
