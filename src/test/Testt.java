package test;

//sort list employee based age and name

// amount, date, name
// list of Trasaction how to sort

public class Testt {
    public static void main(String[] args) {

        String name = "anup mugabasav";
        char[] chars = name.toCharArray();

        int[] freq = new int[26];

        for(char ch :  chars){
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26 ; i++) {
            if(freq[i] > 1){
                System.out.println((char)(i + 'a') + " : "+ freq[i]);
            }
        }


    }
}
