package lpa;

import java.util.Arrays;
import java.util.Random;

public class ChallengeSortArray {


    public static void main(String[] args) {

        int[] myArray = getRandom(10);
        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length / 2 ; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;

        }

        System.out.println(Arrays.toString(myArray));


    }

    public static int[] getRandom(int length){
        Random random = new Random();
        int[] myArray = new int[length];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(100);
        }

        return myArray;
    }
}
