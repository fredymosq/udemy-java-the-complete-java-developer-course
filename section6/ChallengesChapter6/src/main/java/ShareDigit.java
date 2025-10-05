public class ShareDigit {

    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 13;
        boolean sharedDigit = hasSharedDigit(number1, number2);
        System.out.println("shared Digit?: "+sharedDigit);
    }

    private static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            return  false;
        }

        while (number1 > 0){
            int digit = number1 % 10;

            int number2Copy = number2;
            while (number2Copy > 0){
                int digit2 = number2Copy % 10;
                if (digit == digit2){
                    return true;
                }

                number2Copy = number2Copy / 10;
            }

            number1 = number1 / 10;
        }
        return false;
    }
}
