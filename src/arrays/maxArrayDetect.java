package arrays;

public class maxArrayDetect {
    public static void main(String[] args) {

        final int[] array = {1, 5, 9, 3, 1};
        System.out.println(minNum(array));
        System.out.println(sumArray(array));

    }

    public static int maxNum(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }

        }
        return max;
    }

    public static int sumArray(int[] array)
    {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
    public static int minNum(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }

        }
        return min;
    }

}

