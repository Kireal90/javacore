package com.kitcenter.app.classwork.lesson15;

public enum Holiday {

    BIRTHDAY(11, "July", "Birthday"),
    INDEPENDANCE_DAY(24, "August", "Independance day"),
    NEW_YEAR(1, "January", "New Year");
    public int dateOfHoliday;
    public String monthOfHoliday;
    public String desc;

    private Holiday(int date, String month, String description) {
    this.dateOfHoliday = date;
    this.monthOfHoliday = month;
    this.desc = description;

    }
    public int getValue () {
        return dateOfHoliday;
    }
}
