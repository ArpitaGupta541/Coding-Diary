//Reverse The Number

import java.util.*;

class ReverseTheNumber {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int rev = 0;
            while (x > 0) {
                int digit = x % 10;
                rev = rev * 10 + digit;
                x = x / 10;
            }
            System.out.println(rev);
        }
    }
}
