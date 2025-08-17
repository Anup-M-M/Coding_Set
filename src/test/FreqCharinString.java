package test;

public interface FreqCharinString {
    public static void main(String[] args) {
        String str = "aabbzbccdeffcfzzzz";

        int[] freq = new int[256];

        for(char c : str.toCharArray()){
            freq[c]++;
        }

        char maxChar = ' ';
        int maxCount =  0;

        for (int i = 0; i < 256; i++) {
            if(freq[i] > maxCount){
                maxCount = freq[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Max frq char is : "+ maxChar);
    }
}
