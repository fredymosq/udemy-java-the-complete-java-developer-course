import java.util.Scanner;

public class InputCalculator {


    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {

        int sum = 0;
        long average = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){

            String lineRead = scanner.nextLine();
            try {
                int number  = Integer.parseInt(lineRead);
                sum += number;
                counter++;

            }catch (NumberFormatException nfe){
                break;
            }
        }
        if(counter > 0){
            average = Math.round((double) sum / counter);
        }
        System.out.println("SUM = "+sum+" AVG = "+ (average));
    }
}
