package com.github.limors.interviewsquestions.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BalancedBracketsTest {


    @Test
    void happyPathFirstBrackets(){
        Assertions.assertEquals(BalancedBrackets.BALANCES_RESULT,BalancedBrackets.isBalanced("()"));
    }

    @Test
    void happyPathSecondBrackets(){
        Assertions.assertEquals(BalancedBrackets.BALANCES_RESULT,BalancedBrackets.isBalanced("{}"));
    }

    @Test
    void happyPathThirdBrackets(){
        Assertions.assertEquals(BalancedBrackets.BALANCES_RESULT,BalancedBrackets.isBalanced("[]"));
    }

    @Test
    void notBalancedFirstBrackets(){
        Assertions.assertEquals(BalancedBrackets.NOT_BALANCES_RESULT,BalancedBrackets.isBalanced(")"));
    }

    @Test
    void  notBalancedSecondBrackets(){
        Assertions.assertEquals(BalancedBrackets.NOT_BALANCES_RESULT,BalancedBrackets.isBalanced("}{"));
    }

    @Test
    void  notBalancedBrackets(){
        Assertions.assertEquals(BalancedBrackets.NOT_BALANCES_RESULT,BalancedBrackets.isBalanced("["));
    }

    @Test
    void  emptyString(){
        Assertions.assertEquals(BalancedBrackets.BALANCES_RESULT,BalancedBrackets.isBalanced(""));
    }


    @Test
    void  noBracketsString(){
        Assertions.assertEquals(BalancedBrackets.BALANCES_RESULT,BalancedBrackets.isBalanced("addsgflkjh"));
    }

    @Test
    void  mixedString(){
        Assertions.assertEquals(BalancedBrackets.NOT_BALANCES_RESULT,BalancedBrackets.isBalanced("(ad[dsgf]lk(jh"));
    }

}