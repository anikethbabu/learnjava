public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(0, 10));
    }

    static boolean isOdd(int number) {
        if (number <= 0)
            return false;

        return (!(number % 2 == 0));
    }

    static int sumOdd(int start, int end) {
        if (start > end || start <  0 ) {
            System.out.println("You entered invalid numbers");
            return 0;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i))
                sum += i;
        }
        return sum;
    }

}
