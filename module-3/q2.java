import java.util.*;

public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Enter operator:");
        String op = sc.next();

        if (op.equals("+")) {
            System.out.println("Addition: " + (n1 + n2));
        }
        else if (op.equals("-")) {
            System.out.println("Subtraction: " + (n1 - n2));
        }
        else if (op.equals("*")) {
            System.out.println("Multiplication: " + (n1 * n2));
        }
        else if (op.equals("/")) {
            if (n2 == 0) {
                System.out.println("Division by Zero undefined");
            } else {
                System.out.println("Division: " + (n1 / n2));
            }
        }
        else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}