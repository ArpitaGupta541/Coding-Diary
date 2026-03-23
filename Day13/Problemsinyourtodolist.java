//Problemsinyourtodolist

import java.util.*;

class Problemsinyourtodolist {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int count = 0;

            for (int i = 0; i < N; i++) {
                int d = sc.nextInt();

                if (d >= 1000) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
