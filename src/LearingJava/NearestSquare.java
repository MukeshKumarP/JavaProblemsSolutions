package LearingJava;

public class NearestSquare {
    public static int findNearestSquare(int num){
        double actSqRt = Math.sqrt(num);
        int x = (int) actSqRt;
        int y = (x+1)*(x+1);

        if(Math.abs(num-(x*x)) < Math.abs(num-y)){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
        return 0;
    }

    public static void main(String[] args) {
        findNearestSquare(91);
       // System.out.println(Math.sqrt(55));
    }
}
