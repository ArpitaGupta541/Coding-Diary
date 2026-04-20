
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((x * 1) + (y * 2) >= a) {
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }
    }
}
