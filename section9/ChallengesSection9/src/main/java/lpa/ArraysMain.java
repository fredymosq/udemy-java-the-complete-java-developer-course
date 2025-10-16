package lpa;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {


    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
//        int[] firstPositives = new int[]{1,2,3,4,5};
//
//        System.out.println("length of array: "+firstPositives.length);
//        System.out.println("last = "+firstPositives[firstPositives.length - 1]);
//
//        for (int element : firstPositives){
//            System.out.println(element+" ");
//        }

        int[] myArray = getRandom(10);
        System.out.println("random array: "+ Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println("random array sorted: "+ Arrays.toString(myArray));

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(s1, s2));


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
