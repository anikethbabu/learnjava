public class WhileLoop {
    public static void main(String[] args) {
numberCheck(5, 20);
    }

    static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }

    static void numberCheck(int number, int finishNumber) {
     int EvenNum = 0;
        while (number <= finishNumber && EvenNum < 5) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number" + number);
            EvenNum++;

        }
        System.out.println("Even Numbers Found:" + EvenNum);
    }
}

