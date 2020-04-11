import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                    System.out.println(max);
                }

                if (number < min) {
                    min = number;
                }


            } else {
                System.out.println("Invalid number");
                break;

            }
            scanner.nextLine();
        }
        scanner.close();
    }


}
