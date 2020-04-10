public class FlourPack {
    public static void main(String[] args) {
        if (canPack(1, 0, 4))
        {
            System.out.println("Calculation is wrong");
        }
        if (!canPack(5, 2, 5))
        {
            System.out.println("Calculation is wrong");
        }
        }


    static boolean canPack (int bigCount, int smallCount, int goal)
    {
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }
        int totalCount = bigCount * 5 + smallCount;
        return (totalCount >= goal);

    }
}
