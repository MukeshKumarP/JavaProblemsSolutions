package arrays;

public class StudentRunner {
    public static void main(String[] args) {

        int[] sal = {14,13,16,11};
        Student student = new Student("Muki",sal);
        int number = student.getNumberOfMarks();
        System.out.println("getNumberOfMarks :"+number);

        int sumOfMarks = student.getSumOfMarks();
        System.out.println("sumOfMarks :: "+sumOfMarks);


        int getMaximumMark = student.getMaxOfMarks();
        System.out.println("getMaximumMark :: "+getMaximumMark);

        int getMinimumMark = student.getMinOfMarks();
        System.out.println("getMinimumMark :: "+getMinimumMark);

    }
}
