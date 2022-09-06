class O {
    int x = 10;
    int y = 11;
    int z = 12;
    public O(int x, int y, int thisZ) {
        x = x;
        this.y = y;
        z = thisZ;
    }
}

public class Q {
    public static void main(String[] args) {
        O o1 = new O(5,6,7);
        System.out.println(o1.x + " , " + o1.y + " , " + o1.z);

    }
    
}
