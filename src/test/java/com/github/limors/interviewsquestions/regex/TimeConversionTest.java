package com.github.limors.interviewsquestions.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

    @Test
    void happyPathPm(){
        Assertions.assertEquals("19:05:45", TimeCnvertor.timeConversion("07:05:45PM"));
    }

    @Test
    void happyPathAm(){
        Assertions.assertEquals("07:05:45", TimeCnvertor.timeConversion("07:05:45AM"));
    }

    @Test
    void twelvePM(){
        Assertions.assertEquals("12:05:45", TimeCnvertor.timeConversion("12:05:45PM"));
    }

    @Test
    void twelveM(){
        Assertions.assertEquals("00:05:45", TimeCnvertor.timeConversion("12:05:45AM"));
    }


}