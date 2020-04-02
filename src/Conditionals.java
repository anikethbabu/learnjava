import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
    drinkingAbility();
    }

    public static void drinkingAbility()
    {
        int age;
        System.out.println("Enter Your age?");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 21 )
        {
            System.out.println("You can drink");
        }
        else
        {
            System.out.println("You are under the drinking age");
        }

    }
}


