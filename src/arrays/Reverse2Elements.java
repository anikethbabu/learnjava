package arrays;

import java.util.Arrays;

public class Reverse2Elements {
    public static void main(String[] args) {
        int[] a = {12, 45};
        System.out.println(a[0] + ", " + a[1]);
        reverse(a);
        System.out.println(a[0] + ", " + a[1]);
    }

    private static void reverse(int[] a) {
        int temp = a[1];
        a[1] = a[0];
        a[0] = temp;

    }
}
