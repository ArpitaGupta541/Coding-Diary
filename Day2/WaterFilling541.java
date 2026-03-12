
import java.util.*;

class WaterFilling541 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if ((x == 0 && y == 0) || (x == 0 && z == 0) || (y == 0 && z == 0)) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
        }
    }
}
