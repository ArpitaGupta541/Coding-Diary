
import java.util.*;

class RecoverPalindrome {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean ans = true;
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) == '?' && s.charAt(n - 1 - i) == '?') {
                    ans = false;
                    break;
                }
            }
            if (n % 2 == 1 && s.charAt(n / 2) == '?') {
                ans = false;
            }

            if (ans) {
                System.out.println("YES"); 
            }else {
                System.out.println("NO");
            }
        }
    }
}
