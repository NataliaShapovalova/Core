package main;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] myArray = new int []{5,6,3,2,5,1,4,9};

        arraySort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void arraySort(int[] myArray) {
        int buffer;
        boolean less = false;

        while (!less){
            less = true;
            for (int i = 0; i < myArray.length-1; i++ ){
                if (myArray[i] > myArray[i+1]) {
                    less = false;
                    buffer = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = buffer;

                }
            }
        }
    }
}
