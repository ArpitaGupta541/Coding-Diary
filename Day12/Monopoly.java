//Monopoly

import java.util.*;

class Monopoly {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int max = Math.max(Math.max(P, Q), Math.max(R, S));
            int sum = P + Q + R + S;
            if (max > (sum - max)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
