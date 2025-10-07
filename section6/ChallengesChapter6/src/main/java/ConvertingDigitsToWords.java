public class ConvertingDigitsToWords {

    public static void main(String[] args) {
        int number = 1450;
        numberToWords(number);
    }

    private static void numberToWords(int number) {

        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        if (number <= 9){
            printWordNumber(number);
        }

        int reverseNumber = reverse(number);
        int leadingZeros =  getDigitCount(number) - getDigitCount(reverseNumber);

        while (reverseNumber > 0){
            int digit = reverseNumber % 10;
            printWordNumber(digit);

            reverseNumber = reverseNumber / 10;
        }


        for (int i = 0; i <  leadingZeros ; i++) {
            System.out.println("Zero");
        }

    }

    private static void printWordNumber(int digit) {
        switch (digit){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }

    private static int reverse(int number) {
        int numberCopy = number < 0? (number * -1) : number;
        int sum = 0;
        while (numberCopy > 0){
            int digit = numberCopy % 10;
            sum *= 10;
            sum += digit;
            numberCopy = numberCopy / 10;
        }
        return number < 0 ? (sum * -1): sum;
    }

    private static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        if (number < 10){
            return 1;
        }

        int count = 0;
        while (number > 0){
            count++;
            number = number / 10;

        }

        return count;
    }
}
