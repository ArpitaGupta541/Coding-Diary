
import java.util.*;

class BathinWinters {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int people = X / (2 * Y);
            System.out.println(people);
        }
    }
}
