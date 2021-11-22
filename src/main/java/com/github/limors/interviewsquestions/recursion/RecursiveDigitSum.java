package com.github.limors.interviewsquestions.recursion;

import java.util.stream.IntStream;

/**
 * We define super digit of an integer x using the following rules:
 * <p>
 * Given an integer, we need to find the super digit of the integer.
 * <p>
 * If x has only  digit, then its super digit is .
 * Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x .
 * <p>
 * the number p is created by concatenating the string n  times k
 */
public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        if(n.length() == 1 && k ==1) {
            return Integer.parseInt(n);
        }

        long sumDigit = n.chars().map(Character::getNumericValue).reduce(0 , Integer::sum);
        return superDigit(Long.toString(sumDigit*k ), 1);


    }


}
