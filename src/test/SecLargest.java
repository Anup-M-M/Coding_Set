package test;

public class SecLargest {
    public static void main(String[] args) {
        int[] arr ={12, 35, 1, 10, 34};

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }

        System.out.println(" Sec Largest Value : " + secLargest);
    }
}
