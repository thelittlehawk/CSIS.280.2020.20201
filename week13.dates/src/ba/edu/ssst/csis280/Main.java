package ba.edu.ssst.csis280;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("LOCAL DATE");
        LocalDate localDate = LocalDate.now();

        LocalDateTime datetime = LocalDateTime.now();

        String localDateString = localDate.toString();
        String localDatetimeString = datetime.toString();
        System.out.println(localDateString);
        System.out.println(localDatetimeString);

        System.out.println("Year: " + localDate.getYear());
        System.out.println("Month: " + localDate.getMonth());
        System.out.println("Month Value: " + localDate.getMonthValue());
        System.out.println("Day: " + localDate.getDayOfYear());
        System.out.println("Day Week: " + localDate.getDayOfWeek());
        System.out.println("Day Month: " + localDate.getDayOfMonth());
        System.out.println("");
        System.out.println("");
        System.out.println("Hour:" + datetime.getHour());
        System.out.println("Minutes:" + datetime.getMinute());
        System.out.println("Seconds:" + datetime.getSecond());
        System.out.println("");
        System.out.println("");

        System.out.println("ZONE DATE");
        ZonedDateTime zoneDate = ZonedDateTime.now();
        System.out.println(zoneDate);


        System.out.println("");
        System.out.println("");

        System.out.println("Formatted Date");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
            Date parsedDate = simpleDateFormat.parse("2021-06-21 01:20:24");
            System.out.println(parsedDate);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println(localDate.format(dateTimeFormatter));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
