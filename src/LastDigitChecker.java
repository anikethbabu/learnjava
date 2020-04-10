public class LastDigitChecker {
    public static void main(String[] args) {
        assert !hasSameLastDigit(41, 22, 73) : "Error: This should return true as both have same last digit";
        assert hasSameLastDigit(23, 32, 42) : "Error: This should return true as both have same last digit";
    }

    private static boolean hasSameLastDigit(int a, int b, int c) {
        return ((a % 10) == (b % 10)) || ((a % 10) == (c % 10)) || ((b % 10) == (c % 10));
    }
}
