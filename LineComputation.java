import java.util.Scanner;

public class LineComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Line Computation Comparison Program");

        System.out.println("Enter the coordinates of first point P(x1,y1)");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of first point P(x2,y2)");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double t1 = x2-x1;
        double t2 = y2-y1;
        double length = Math.sqrt(t1*t1 + t2*t2);

        System.out.println("The length of your line is "+length);
    }
}
