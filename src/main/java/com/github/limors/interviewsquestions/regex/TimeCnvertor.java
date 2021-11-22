package com.github.limors.interviewsquestions.regex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * <p>
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */
public class TimeCnvertor {

    public final static Pattern HOUR_FORMAT_PATTERN = Pattern.compile("(\\d\\d):(\\d\\d):(\\d\\d)(.*)");

    public static String timeConversion(String s) {

        Matcher matcher = HOUR_FORMAT_PATTERN.matcher(s);

        if (!matcher.matches()) {
            throw new RuntimeException(String.format("Time format is illegal: %s", s));
        }

        TwlevHourseFormater hoursFormatter = TwlevHourseFormater.valueOf(matcher.group(4));
        int afterAdding = convertHours(Integer.parseInt(matcher.group(1)), hoursFormatter);
        return String.format("%02d:%s:%s", afterAdding, matcher.group(2), matcher.group(3));
    }

    private static int convertHours(int hours, TwlevHourseFormater format) {
        int addToHours = hours != 12 ? 0 : 12;
        return (format.getHowMatchToAddFor24() +addToHours + hours) % 24;
    }

}
