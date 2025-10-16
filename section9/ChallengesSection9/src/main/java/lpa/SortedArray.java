package lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


    public static void main(String[] args) {
       // int[] array = {106,26,81,5,15};
        int[] array = getIntegers(5);
        array = sortIntegers(array);
        printArray(array);
    }

    public static int[] getIntegers(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter "+size+" integer values");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] sortIntegers(int[] array){
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);

        for (int i = 0; i < arrayCopy.length / 2; i++) {
            int temp = arrayCopy[i];
            arrayCopy[i] = arrayCopy[arrayCopy.length - 1 - i];
            arrayCopy[arrayCopy.length - 1 - i] = temp;
        }

        return arrayCopy;

    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }


}
