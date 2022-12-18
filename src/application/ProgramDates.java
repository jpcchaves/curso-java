package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramDates {
  public static void main(String[] args) {
    DateTimeFormatter pattern =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();
    LocalDate d04 = LocalDate.parse("2022-07-20");
    LocalDateTime d05 = LocalDateTime.parse("2022-07" +
            "-20T01:30:26");

    Instant dinstant = Instant.parse("2022-07-20T01:30:26Z");

    LocalDate d06 = LocalDate.parse("20/07/2022", pattern);

    System.out.println("D01 = " + d01);
    System.out.println("-------------");
    System.out.println("D02 = " + d02);
    System.out.println("-------------");
    System.out.println("D03 = " + d03);
    System.out.println("-------------");
    System.out.println("D04 = " + d04);
    System.out.println("-------------");
    System.out.println("D05 = " + d05);
    System.out.println("-------------");
    System.out.println("D06 = " + d06);

    System.out.println("-------------");
    // datetimeformatter
    DateTimeFormatter fmtISO_DATE_TIME = DateTimeFormatter.ISO_DATE_TIME;

    LocalDateTime d07 = LocalDateTime.parse("2022-07-20T01:30:26", fmtISO_DATE_TIME);
    System.out.println("D07: " + d07);

    System.out.println();
    System.out.println("-------------");
    System.out.println("-------------");
    System.out.println();

    LocalDate r1 = LocalDate.ofInstant(dinstant, ZoneId.systemDefault());
    System.out.println("R1: " + r1.getDayOfMonth());
    System.out.println("R1: " + r1.getMonth());
    System.out.println("R1: " + r1.getMonthValue());
    System.out.println("R1: " + r1.getYear());

    System.out.println("d05: " + d05.getDayOfMonth() + " " + d05.getHour() +
            ":" + d05.getMinute() +
            ":" + d05.getSecond());

    System.out.println(d05.plusDays(7).getDayOfMonth());
  }
}
