package com.company.hometask_22.date_task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        System.out.println(dateToLocalDate(date));
        System.out.println(dateToLocalTime(date));
        System.out.println(dateToLocalDateTime(date));
    }

    public static LocalDate dateToLocalDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime dateToLocalTime(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime dateToLocalDateTime(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
