
import java.util.*;

class Flipthecards {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            int result = Math.min(X, N - X);
            System.out.println(result);
        }
    }
}
