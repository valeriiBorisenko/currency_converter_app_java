package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void prntDateTime () {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();

        dataMessage("Today", today.toString());
        dataMessage("Time", time.truncatedTo(ChronoUnit.SECONDS).toString());
    }

    private static void dataMessage(String type, String result) {
        System.out.println(type + ": " + result);
    }
}
