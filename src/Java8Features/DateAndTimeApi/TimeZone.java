package Java8Features.DateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
    public static void main(String[] args) {
        /* To represent zone we have Class ZoneId*/

        ZoneId sysZone = ZoneId.systemDefault();
        System.out.println("Current System Time Zone: "+sysZone);
        ZoneId la= ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(la);
        System.out.println("Time of America London is : "+dt);
    }
}
