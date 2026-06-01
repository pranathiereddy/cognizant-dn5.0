import java.util.*;
class InvalidAgeException extends Exception{
    
public InvalidAgeException(String message) {
        super(message);
    }
}

class q21 {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        
  

        try{
        checkAge(age); 
        }
        catch (InvalidAgeException e){
            System.out.println("Exception caught:"+ e.getMessage());
        }
        }
    
}
