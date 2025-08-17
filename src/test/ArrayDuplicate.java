package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



// employee table
// empId, deptId, salary
//  1   1   5000
//  2   1   10000
// 3    2   5000

// select depId, Sum(salary) as totalSalary
//  from employee group by deptId











// Array = 1,2,3,1,2,1
public class ArrayDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1,2,1};

        Map<Integer, Integer> freqMap =  new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num :  arr){
            list.add(num);
        }

        list.sort(( a , b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a);
            return freqCompare;
        });

        System.out.println(list);
    }
}
