package com.hci.lab430.model;

/**
 * Created by lab430 on 15/9/22.
 */
public class CalendarTime {

    private String weekDay;
    private String date;

    public CalendarTime(String weekDay, String date) {
        this.weekDay = weekDay;
        this.date = date;
    }

    public String getWeekDay() {
        return this.weekDay;
    }

    public String getDate() {
        return this.date;
    }


    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
