package com.github.limors.interviewsquestions.recursion;

import com.github.limors.interviewsquestions.recursion.RecursiveDigitSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursiveDigitSumTest {


    @Test
    void happyPath(){
        Assertions.assertEquals(8, RecursiveDigitSum.superDigit("593", 10));
    }

    @Test
    void stopAtOneDig(){
        Assertions.assertEquals(1, RecursiveDigitSum.superDigit("1", 1));
    }


    @Test
    void oneDigMultiTime(){
        Assertions.assertEquals(3, RecursiveDigitSum.superDigit("1", 3));
    }


    @Test
    void longNumber(){
        Assertions.assertEquals(5, RecursiveDigitSum.superDigit("3546630947312051453014172159647935984478824945973141333062252613718025688716704470547449723886626736"
                ,100000));
    }
}