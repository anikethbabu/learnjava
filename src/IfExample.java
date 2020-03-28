import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        if (age < 18)
            System.out.println("Sorry, you are NOT eligible to vote");
        else
            System.out.println("Congrats! You are eligible to vote");
    }
}
