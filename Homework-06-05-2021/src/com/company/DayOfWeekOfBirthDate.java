package com.company;

import java.time.LocalDate;

public class DayOfWeekOfBirthDate {

    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1999, 12, 29);
        printDayOfWeekOfBirthDates(birthDate);

    }


    public static void printDayOfWeekOfBirthDates(LocalDate birthDate) {
        for (LocalDate date = birthDate; date.isBefore(LocalDate.now()); date = date.plusYears(1)) {
            System.out.println(date.getDayOfWeek().toString());
        }
    }

}
