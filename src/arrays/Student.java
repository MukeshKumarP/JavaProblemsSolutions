package arrays;

public class Student {

    private String name;
    private int[] sal;


    public Student(String name, int[] sal) {
        this.name = name;
        this.sal = sal;
    }

    public int getNumberOfMarks() {
        return sal.length;
    }

    public int getSumOfMarks() {
        int sumSalary = 0;

        for (int salSum : sal) {
            sumSalary += salSum;
        }
        return sumSalary;
    }

    public int getMaxOfMarks() {
        int maxValue = 0;
        for(int value : sal){
            if(value > maxValue){
                maxValue=value;
            }
        }
        return maxValue;
    }

    public int getMinOfMarks() {
        int minValue = Integer.MAX_VALUE;
        for(int value : sal){
            if(value < minValue){
                minValue=value;
            }
        }
        return minValue;
    }
}
