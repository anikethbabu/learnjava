public class FlourPack {
    public static void main(String[] args) {

    }
    static boolean canPack (int bigCount, int smallCount, int goal)
    {
        int totalCount = bigCount * 5 + smallCount;
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }
        if (totalCount >= goal)
        {
            return true;
        }
        return false;

    }
}
