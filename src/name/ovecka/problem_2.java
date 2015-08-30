package name.ovecka;

/**
 * Created by marek on 30/08/15.
 */
public class problem_2 {
    static int sum = 2;
    public static void run() {
        fibo(1,2);
    }

    private static void fibo(int i, int j){
        int a = i + j;
        if(a < 4000000) {
            if((a % 2) == 0){
                sum += a;
            }
            fibo(j, a);
        }
        else{
            System.out.println("Problem 2 result: "+sum);
        }
    }
}
