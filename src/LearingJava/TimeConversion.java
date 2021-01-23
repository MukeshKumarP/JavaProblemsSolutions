package LearingJava;

import java.io.PrintStream;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.TimeZone;

public class TimeConversion {
    static String findTimeConversion(String a){
        String[] newString = a.split(":");
        String amOrPM = newString[2].substring(2,4);
        int hh,mm,ss;
        hh = Integer.parseInt(newString[0]);
        mm = Integer.parseInt(newString[1]);
        ss = Integer.parseInt(newString[2].substring(0,2));

        if(amOrPM.equals("AM") & hh == 12){
            hh=0;
        } else if(amOrPM.equals("PM") & hh < 12){
            hh+=12;
        }
        String value = String.valueOf(hh+mm+ss);
        String temp = String.format("%02d:%02d:%02d", hh, mm, ss);
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        findTimeConversion("04:59:59AM");
    }
}
