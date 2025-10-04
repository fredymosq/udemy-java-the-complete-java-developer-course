public class PrintingEvenNumbers {

    public static void main(String[] args) {

        printEvenNumbers(5, 50);
    }

    private static void printEvenNumbers(int start, int end) {

        while (start <= end){
            if (isEven(start)){
                System.out.println(start);
            }

            start++;
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
