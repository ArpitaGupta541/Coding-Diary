//NearestExit

import java.util.*;

class NearestExit {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();

            if (X <= 50) {
                System.out.println("LEFT");
            } else {
                System.out.println("RIGHT");
            }
        }

        sc.close();
    }
}
