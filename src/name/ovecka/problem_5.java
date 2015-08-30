package name.ovecka;

/**
 * Created by marek on 30/08/15.
 */
public class problem_5 {
    //Highly ineficient
    public static void run(){
        int number = 2519;
        boolean found = false;
        while(!found){
            number++;
            int win = 0;
            for(int i = 1; i <= 20; i++){
                if((number % i) == 0) win ++;
            }
            if(win == 20) found = true;
        }
        System.out.println("Problem 5 result: "+number);
    }
}
