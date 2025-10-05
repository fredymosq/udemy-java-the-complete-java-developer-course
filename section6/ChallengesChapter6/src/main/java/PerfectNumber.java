public class PerfectNumber {

    public static void main(String[] args) {
        int number = 6;
        boolean perfectNumber = isPerfectNumber(number);
        System.out.println(number+" is perfect number : "+perfectNumber);
    }

    private static boolean isPerfectNumber(int number) {

        if (number < 1){
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                sum += i;
            }
        }

        return number == sum;
    }
}
