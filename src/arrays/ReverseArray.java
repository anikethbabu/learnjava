package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        final int[] array = {1, 5, 9, 3, 2};
        ArrayChallenge.printArray(array);
        reverse(array);
        ArrayChallenge.printArray(array);
    }

    private static void reverse(int[] a) {
        for (int i = 0, j = a.length - 1; i < j; j--, i++) {
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }


    }

}


