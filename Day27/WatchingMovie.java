
import java.util.*;

class WatchingMovie {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int time = (Y / 2) + (X - Y);

        System.out.println(time);
    }
}
