import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = new Random().nextInt(100) + 1;
        int guess;

        do {
            guess = sc.nextInt();
            if(guess < target) System.out.println("Too Low");
            else if(guess > target) System.out.println("Too High");
        } while(guess != target);

        System.out.println("Correct!");
    }
}