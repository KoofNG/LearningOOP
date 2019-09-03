package interFaces;

import java.time.*;

public class SimpleTimeClient implements TImeClient {

    private LocalDateTime dateAndTime;

    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);
    }

    public void setTime(int hour, int minute, int second) {
        System.out.println(dateAndTime);
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime currentTime = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, currentTime);
    }

    public void setDate(int day, int month, int year){
        LocalDate dateToSet = LocalDate.of(day,month,year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
    }

    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second){
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour,minute,second);
        dateAndTime = LocalDateTime.of(dateToSet,timeToSet);
        System.out.println("Hello");
    }

    public LocalDateTime getLocalDate() {
        return dateAndTime;
    }

    public String toString() {
        return dateAndTime.toString();
    }

    public static void main(String[] args) {
        SimpleTimeClient newTime = new SimpleTimeClient();

        System.out.println("Current Time is :" + newTime.toString());
        System.out.println("Current Time is :" + newTime.getZoneDateTime("Africa/Lagos").toString());
    }
}
