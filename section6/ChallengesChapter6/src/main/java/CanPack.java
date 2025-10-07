public class CanPack {

    public static void main(String[] args) {
        int bigCount = 1;
        int smallCount = 0;
        int goal = 4;

        boolean isPack = canPack(bigCount, smallCount, goal);
        System.out.println("Can pack: "+isPack);
    }

    private static final int BIG_WEIGHT = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}
