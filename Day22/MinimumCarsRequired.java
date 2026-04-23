//MinimumCarsRequired

import java.util.*;

class MinimumCarsRequired {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int car = (n + 3) / 4;
            System.out.println(car);
        }
    }
}
