public class Numbers2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
