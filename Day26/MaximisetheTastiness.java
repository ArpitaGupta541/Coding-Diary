
import java.util.*;

class MaximisetheTastiness {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int ans = Math.max(a, b) + Math.max(c, d);

            System.out.println(ans);
        }
    }
}
