//MinimumPizzas

import java.util.*;

class MinimumPizzas {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextInt();
            double x = sc.nextInt();
            double a = (n * x) / 4;
            System.out.println((int) Math.ceil(a));
        }
    }
}
