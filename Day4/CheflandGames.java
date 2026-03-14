
import java.util.*;

class CheflandGames {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int r3 = sc.nextInt();
            int r4 = sc.nextInt();
            if (r1 == 1 || r2 == 1 || r3 == 1 || r4 == 1) {
                System.out.println("OUT"); 
            }else {
                System.out.println("IN");
            }
        }
    }
}
