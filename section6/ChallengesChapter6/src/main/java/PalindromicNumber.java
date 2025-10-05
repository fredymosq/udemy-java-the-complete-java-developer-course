public class PalindromicNumber {

    public static void main(String[] args) {
        int number = -121;
        System.out.println(number+" is palindrome?: "+isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {

        if ((number > 0 && number < 10) || (number > -10 && number < 0)){
            return false;
        }
        int reverse = 0;
        int numberCopy = number < -10 ? (-1 * number): number;
        while (numberCopy > 0) {
            int lastDigit = numberCopy % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            numberCopy = numberCopy / 10;

            System.out.println(reverse);

        }
        if (number < -10){
            number = number * -1;
        }

        return  number == reverse;
    }
}
