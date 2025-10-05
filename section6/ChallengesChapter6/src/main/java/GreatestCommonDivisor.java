public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 15;

        int gcd = getGreatestCommonDivisor(number1, number2);
        System.out.println("GCD: "+gcd);
    }

    private static int getGreatestCommonDivisor(int number1, int number2) {

        if (number1  < 10 || number2 < 10) {
            return -1;
        }

        int max = number1 > number2 ? number1 : number2;

        int gcd = 0;
        for (int i = 1; i < max; i++) {
            if (number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
