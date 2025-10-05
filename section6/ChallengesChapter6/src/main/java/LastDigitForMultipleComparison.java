public class LastDigitForMultipleComparison {

    public static void main(String[] args) {
        int number1 = 23;
        int number2 = 32;
        int number3 = 42;

        boolean isSameDigit = hasSameLastDigit(number1, number2, number3);
        System.out.println("Has same las digit: "+isSameDigit);
    }

    private static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if(!isValid(number1) || !isValid(number2) || !isValid(number3)){
            return false;
        }

        int rightMostDigitNumber1 = number1 % 10;
        int rightMostDigitNumber2 = number2 % 10;
        int rightMostDigitNumber3 = number3 % 10;


        return (rightMostDigitNumber1 == rightMostDigitNumber2 || rightMostDigitNumber1 == rightMostDigitNumber3 || rightMostDigitNumber2 == rightMostDigitNumber3);
    }

    private static boolean isValid(int number) {

        return number >= 10 && number <= 1000;
    }
}
