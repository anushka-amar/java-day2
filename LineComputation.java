import java.util.Scanner;

public class LineComputation {

    static double calculate_length(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of first point P(x1,y1)");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of second point Q(x2,y2)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double t1 = x2-x1;
        double t2 = y2-y1;
        double length = Math.sqrt(t1*t1 + t2*t2);

        System.out.println("The length of your line is "+length);

        return length;

    }

    static void check_equality(double line1, double line2){
        String l1 = Double.toString(line1);
        String l2 = Double.toString(line2);

        boolean equality = l1.equals(l2);

        if(equality){
            System.out.println("The lines are equal");
        }else {
             if(line1>line2){
                 System.out.println("line 1 is greater in magnitude");
             }else{
                 System.out.println("line 2 is greater in magnitude");
             }
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Line Computation Comparison Program");

        System.out.println("please provide the coordinates for both the lines");
        double line1 = calculate_length();
        double line2 = calculate_length();

        System.out.println("Checking equality of the lines");
        check_equality(line1, line2);


    }
}
