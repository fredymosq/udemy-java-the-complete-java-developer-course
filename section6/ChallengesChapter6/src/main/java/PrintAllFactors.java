public class PrintAllFactors {

    public static void main(String[] args) {
        int number = 6;
        printFactors(number);
    }

    private static void printFactors(int number) {

        if (number < 1){
            System.out.println("Invalid Value");
            return;
        }

        int i = 1;
        while (i <= number){
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
