public class SumAllEvenDigits {

    public static void main(String[] args) {
        int number = 123456789;
        int sum = getEvenDigitSum(number);
        System.out.println("The sum of all even digit numbers of "+number+" = "+sum);
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0){
            return -1;
        }

        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            if (isEvenNumber(digit)){
                sum = sum + digit;
            }
            number = number / 10;
        }

        return  sum;
    }

    private static boolean isEvenNumber(int digit) {

        return digit % 2 == 0;
    }
}
