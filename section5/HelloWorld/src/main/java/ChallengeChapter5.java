public class ChallengeChapter5 {

    public static void main(String[] args) {
        //Step 1: create a double variable with a value of 20.00

        double myFirstDoubleVariable = 20.00;

        //Step 2: create a second double variable with a value of 80.00
        double mySecondDoubleVariable = 80.00;

        //Step 3: add both numbers together, the multiply by 100.00
        double sum = (myFirstDoubleVariable + mySecondDoubleVariable) * 100.00;

        //Step 4: use the remainder operator, to figure out what the remainder from
        //the result of the operation in step three, and 40.00, will be
        double remainder = sum % 40.00;

        //Step 5: create a boolean variable that assigns the value true, if the remainder in
        //step four is 0.00, or false it is not zero
        boolean isRemainderZero = remainder == 0.00;

        //Step 6: output the boolean variable just to see what result is
        System.out.println("Remainder is zero?: "+isRemainderZero);

        //Step 7: write an if-then statement that displays a message. 'got some remainder'
        //if the boolean in step five is not true
        if (isRemainderZero == false){
            System.out.println("got some remainder");
        }


    }
}
