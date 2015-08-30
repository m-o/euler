package name.ovecka;

/**
 * Created by marek on 30/08/15.
 */
public class problem_4 {

    public static void run(){
        int start = 100;
        int end = 999;
        int num = 0;
        for(int i = start; i <= end; i++){
            for(int j = start; j <= end; j++){
                int original = i*j;
                int reverse = generatePalindrom(original);
                if(original == reverse){
                    if(original > num) num = original;
                }
            }
        }
        System.out.println("Problem 3 result: " + num);
    }

    private static int generatePalindrom(int i){
        int palindrome = i;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return reverse;
    }
}
