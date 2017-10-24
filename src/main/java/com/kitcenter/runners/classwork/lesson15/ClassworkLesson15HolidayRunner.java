package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.Holiday;

public class ClassworkLesson15HolidayRunner {
    public static void main(String[] args) {
        for (Holiday holiday : Holiday.values()) {
            System.out.println(holiday.desc+" holiday is on "+holiday.monthOfHoliday+", "+holiday.getValue());
        }
    }
}
