package name.ovecka;

/**
 * Created by marek on 30/08/15.
 */
public class problem_1 {

    public static void run(){
        int sum = 0;
        for(int i = 0; i < 1000; i++){
            if((i % 3) == 0){
                sum += i;
            }
            else if(( i % 5) == 0){
                sum +=i;
            }
        }
        System.out.println("Problem 1 result: " + sum);
    }
}
