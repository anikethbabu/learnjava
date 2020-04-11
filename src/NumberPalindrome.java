public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        if (number < 0)
        {
            number = number * -1;
        }
        int compareNumber = number;


        for (int i = 0; number >= 1; i++) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + number % 10;
            //System.out.println(reverseNumber);
            // System.out.println(reverseNumber);
            number = number / 10;
           // System.out.println(number);
        }

        return (reverseNumber == compareNumber);
    }

}
