package com.github.limors.interviewsquestions.stack;

import java.util.*;

/**
 * Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
 */

public class BalancedBrackets {
    public final static String BALANCES_RESULT =  "Yes";
    public final static String NOT_BALANCES_RESULT =  "NO";

    private static Map<Character, Character> openAndClose = new HashMap<>();

    static {
        openAndClose.put('(', ')');
        openAndClose.put('[', ']');
        openAndClose.put('{', '}');
    }

    private static List<Character> OPEN_BRACKETS = new ArrayList<>(openAndClose.keySet());
    private static List<Character> CLOSE_BRACKETS = new ArrayList<>(openAndClose.values());

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        return s.chars().allMatch(c -> isValidString((char) c, stack)) && stack.isEmpty() ? BALANCES_RESULT : NOT_BALANCES_RESULT;
    }

    private static boolean isValidString(char c, Stack<Character> stack) {
        if (CLOSE_BRACKETS.contains(c)) {
            return isEndBracketsAreValid(c, stack);
        } else if (OPEN_BRACKETS.contains(c)) {
            stack.push(c);
            return true;
        }
        return true;
    }

    private static boolean isEndBracketsAreValid(char endBracket, Stack<Character> stack) {
       return !stack.isEmpty() && Optional.of(endBracket).filter(eb -> eb.equals(openAndClose.get(stack.peek()))).map(c -> stack.pop()).isPresent();
    }

}
