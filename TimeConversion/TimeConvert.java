//Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
//Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
import java.io.*;
import java.util.*;

public class TimeConvert {
    static String timeConversion(String s) {

        String[] str = s.split(":");
        String hour = str[0];
        String minutes = str[1];
        String seconds = str[2].substring(0,2);
        String cases = str[2].substring(2,4);
        if (cases.equals("AM")) {
            if (hour.equals("12")) {
                hour = "00";
            }
        }
        else {
            if (!hour.equals("12")) {
                int hr = Integer.parseInt(hour);
                hr = hr + 12;
                hour = "" + hr;
            }
        }
        return (hour + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) throws IOException {

    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
    }
}
