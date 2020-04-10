public class DrawRightTriangle {
    public static void main(String[] args) {
        righttriangle(7);
    }

    static void righttriangle(int size) {
        char hi = '*';
        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(hi);
            } 

        }
    }

}

