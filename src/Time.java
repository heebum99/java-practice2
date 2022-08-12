import java.util.*;
public class Time {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        System.out.println(date);
        System.out.println(cal.get(Calendar.YEAR)+"년"
        +(cal.get(Calendar.MONTH)+1)+"월"
        +cal.get(Calendar.DAY_OF_MONTH)+":"
        +cal.get(Calendar.HOUR_OF_DAY)+":"
        +cal.get(Calendar.MINUTE)+":"
        +cal.get(Calendar.SECOND));
    }
}
