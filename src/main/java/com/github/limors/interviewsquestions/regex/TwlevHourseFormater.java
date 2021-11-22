package com.github.limors.interviewsquestions.regex;

public enum TwlevHourseFormater {

    AM(0),
    PM(12);

    private final int howMatchToAddFor24;

    TwlevHourseFormater(int howMatchToaddFor24) {
        this.howMatchToAddFor24 = howMatchToaddFor24;
    }

    public int getHowMatchToAddFor24() {
        return howMatchToAddFor24;
    }
}
