
import java.util.*;

class ExpertSetter {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if ((x - y) <= (x / 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
