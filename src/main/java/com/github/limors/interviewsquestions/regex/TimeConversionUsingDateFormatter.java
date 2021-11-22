package com.github.limors.interviewsquestions.regex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversionUsingDateFormatter {

    public final static String TO_PATTERN = "HH:mm:ss"; // 24 hour time pattern
    public final static String FROM_PATTERN = "hh:mm:ssa";

    public static String timeConversionUsingDateFormatter(String s) {
        DateFormat dfFrom = new SimpleDateFormat(TO_PATTERN);
        DateFormat dfTo = new SimpleDateFormat(FROM_PATTERN);

        try {
            Date date = dfFrom.parse(s);
            return dfTo.format(date);
        } catch (ParseException e) {
            throw new RuntimeException(String.format("Time format is illegal: %s", s), e);
        }

    }
}
