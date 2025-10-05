public class SumFirstAndLastDigits {

    public static void main(String[] args) {
        int number = 5;
        int sum = sumFirstAndLastDigit(number);
        System.out.println("The sum of first and last digit of: "+number+ " = "+sum);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0){
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = 0;
        if (number > 0 && number < 10){
            firstDigit = number;
            lastDigit = number;

            return firstDigit + lastDigit;
        }

        firstDigit = number % 10;
        number = number / 10;

        while (number > 0){
            int digit = number % 10;
            number = number / 10;

            if (number < 10){
                lastDigit = digit;
            }
        }

        return firstDigit + lastDigit;
    }
}
