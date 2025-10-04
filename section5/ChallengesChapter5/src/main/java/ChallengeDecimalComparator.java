
public class ChallengeDecimalComparator {
    // write code here

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){


        String strNum1 = String.format("%.3f", number1);
        String strNum2 = String.format("%.3f", number2);
        System.out.println(strNum1);

        return strNum1.equals(strNum2);
    }

    public static void main(String[] args) {
        boolean areEqualNumbers = areEqualByThreeDecimalPlaces(3.1756, 3.175);
        System.out.println("Are equals double: "+areEqualNumbers);
    }
}
