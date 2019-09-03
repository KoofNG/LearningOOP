package interFaces;

import java.time.*;

public interface TImeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
    LocalDateTime getLocalDate();

    static ZoneId getZoneId (String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time Zone: " + zoneString + "; using the default zone instead");
            return ZoneId.systemDefault();
        }
    }

    default ZonedDateTime getZoneDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDate(), getZoneId(zoneString));
    }
}
