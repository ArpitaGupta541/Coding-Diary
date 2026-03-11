
import java.lang.*;
import java.util.*;

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int even = 0;
        int odd = 0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int array[] = new int[t];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even += array[i];
            } else {
                odd += array[i];
            }
        }
        if (even > odd) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }
}
