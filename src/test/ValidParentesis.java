package test;

import java.util.Map;
import java.util.Stack;

//Valid Parentheses
//You are given a string with characters: '(', ')', '{', '}', '[', ']'.
//Write a function to determine if the string is valid."
//A string is valid if:
//1. Open brackets are closed by the same type
//2. Open brackets are closed in correct order.
//Examples:
//"()" → true
//"(]" → false
//"([)]" → false
//"{[]}" → true
public class ValidParentesis {
    public static void main(String[] args) {

        String input = "{[]}";

        System.out.println("Is Valid : " + isValidParentesis(input));
    }

    private static boolean isValidParentesis(String input) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map =  Map.of(
                ')', '(',
                ']','[',
                '}','{'
        );

        for(char ch : input.toCharArray()){
            if(map.containsValue(ch))
                stack.push(ch);
            else if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop() != map.get(ch)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
