package fun;

import java.util.HashMap;
import java.util.Map;

// Employee 7th highest salaried emp
// select empName, Distinct salary
// from employee order by salary DESC Limit 1 offset 6


public class TestClass {
    public static void main(String[] args) {
        String input = "anuppn";

        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : input.toCharArray()){
            int frq =  0;
           // freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
            if(!(freqMap.containsKey(c))){
                freqMap.put(c, 1);
            }else {
                frq += freqMap.get(c);
            }

        }

        for(Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
