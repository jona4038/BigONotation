package com.company;

public class Main {

    public static void main(String[] args) {


        int[] talArray = {1,5,9,2,7};

/*
        int temp;
        for (int i = 1; i <talArray.length ; i++) {
            for (int j = i; j > 0 ; j--) {
                if (talArray[j] < talArray[j - 1]) {
                    temp = talArray[j];
                    talArray[j] = talArray[j - 1];
                    talArray[j - 1] = temp;
                }
            }

        }
        for (int i = 0; i < talArray.length; i++) {

            System.out.println(talArray[i]);
        }

*/

        int minSoFar = talArray[0];
        int maxSoFar = talArray[0];

        for (int i = 0; i < talArray.length; i++) {
            if(talArray[i] < minSoFar){
                minSoFar = talArray[i];
            } else if(talArray[i] > maxSoFar){
                maxSoFar = talArray[i];
            }

        }

        int min = minSoFar;
        int max = maxSoFar;

        System.out.println("Min: " + min + "\nMax: " + max);


    }

    public int[] sort(int[] array){
        int temp;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length ; j++) {
                if(array[j] < array[j-1]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

}
