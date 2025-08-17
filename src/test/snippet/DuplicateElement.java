package test.snippet;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 2, 3, 7, 8, 3, 8,3, 3};

        printDuplicateElementV1(arr);
    }

    private static void printDuplicateElementV1(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            boolean duplicate = false;

            for (int k = 0; k < i; k++) {
                if(arr[k] == arr[i]){
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate == true) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }
        }
    }
}
