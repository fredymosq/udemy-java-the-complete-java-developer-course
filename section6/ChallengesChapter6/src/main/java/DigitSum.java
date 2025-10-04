public class DigitSum {


    public static void main(String[] args) {

        int number = 8;
        printDigitSum(number);
    }

    private static void printDigitSum(int number) {

        if (number < 0) {
            System.out.println("can't add negative digits");
            return;
        }

        int sum = 0;
        while (number > 9){
            int digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        sum += number;

        System.out.println(sum);
    }
}
