package name.ovecka;

/**
 * Created by marek on 30/08/15.
 */
public class problem_3 {

    public static int run(long number) {
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }
}
