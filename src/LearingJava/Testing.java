package LearingJava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Testing {

    public static void main(String[] args) {
        GradingStudents gradingStudents = new GradingStudents();
        gradingStudents.calGrading(new ArrayList<Integer>(Arrays.asList(4,73,67,38,33)));
    }
}
