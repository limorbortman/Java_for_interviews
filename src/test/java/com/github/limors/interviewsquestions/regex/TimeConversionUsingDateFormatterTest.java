package com.github.limors.interviewsquestions.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionUsingDateFormatterTest {

    @Test
    void happyPathPm(){
        Assertions.assertEquals("19:05:45", TimeConversionUsingDateFormatter.timeConversionUsingDateFormatter("07:05:45PM"));
    }

    @Test
    void happyPathAm(){
        Assertions.assertEquals("07:05:45", TimeConversionUsingDateFormatter.timeConversionUsingDateFormatter("07:05:45AM"));
    }

    @Test
    void twelvePM(){
        Assertions.assertEquals("12:05:45", TimeConversionUsingDateFormatter.timeConversionUsingDateFormatter("12:05:45PM"));
    }

    @Test
    void twelveAMr(){
        Assertions.assertEquals("00:05:45", TimeConversionUsingDateFormatter.timeConversionUsingDateFormatter("12:05:45AM"));
    }

}