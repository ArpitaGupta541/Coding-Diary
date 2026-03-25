
import java.util.*;

class AirConditionerTemperature {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (Math.max(A, C) <= B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
