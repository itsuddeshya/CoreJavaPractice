package Java8Features.DateAndTimeApi;

import java.time.*;

public class DateAndTime {
    public static <Localdate> void main(String[] args) {
        LocalDate sysDate=LocalDate.now();         //To print System current date
        System.out.println(sysDate);
        LocalTime sysTime= LocalTime.now();        //To print system current time
        System.out.println(sysTime);
//
//        int dd =date.getDayOfMonth();
//        int mm =date.getMonthValue();
//        int yyyy= date.getYear();
//        System.out.println("Today's Day is :" +dd+" Current Month: "+mm+" Current Year:"+yyyy);
//
//        System.out.println(dd +"-"+ mm+"-"+ yyyy); //Using this values we can print it any req format.
//        //System.out.printf("%d-%d-%d",dd,mm,yyyy);
//
//        int hour = time.getHour();
//        int min= time.getMinute();
//        int sec =time.getHour();
//        int nsec = time.getNano();
//        System.out.println("Current hour :" +hour+" Current minnute: "+min+" Current nanosec:"+nsec);

                /* Using single class for date and time*/
//        LocalDateTime dt = LocalDateTime.now();
//        System.out.println("Local Date Time using single class "+ dt);
//        int day =dt.getDayOfMonth();
//        int mon =dt.getMonthValue();
//        int yr= dt.getYear();
//        int hr = time.getHour();
//        int mins= time.getMinute();
//        int secs =time.getHour();
//        int nsecs = time.getNano();

            /* any other date time other then current date time*/
// Syntex LocalDateTime dt = LocalDateTime.of(yy,mm,dd,h,m,s,n);

//        LocalDateTime dt =LocalDateTime.of(1995,05,28,12,45);
//        System.out.println("Entered date" +dt);
//        System.out.println("After 6 month" + dt.plusMonths(6));
//        System.out.println("Before 6 month" + dt.minusMonths(6));

          /* period to represent time period*/

//        LocalDate birthday=LocalDate.of(2000,8,24);
//        LocalDate today = LocalDate.now();
//        Period p = Period.between(birthday,today);
//        System.out.printf("Your age is %d years %d months %d days ", p.getYears(),p.getMonths(),p.getDays());
//        System.out.println("\n");
//
//        LocalDate ageAfter = LocalDate.of(2000+50,8,24);
//        Period p1=Period.between(birthday,ageAfter);
//        System.out.println(p1);

        /* Question- To check leap year*/

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter year");
//        int n = sc.nextInt();
//        Year y =Year.of(n);
//        if(y.isLeap()){System.out.println(n+" is leap year");}
//        else{
//            System.out.println(n+" is not leap year");
//        }



    }

}
