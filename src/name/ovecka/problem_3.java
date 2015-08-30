package name.ovecka;

/**
 * Created by marek on 30/08/15.
 */
public class problem_3 {

    public static void run() {
        long number = 600851475143l;
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        System.out.println("Problem 3 result: "+i);
    }
}
