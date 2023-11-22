import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {

    static void empAtt(){
        Random random = new Random();

        int randNum = Math.abs(random.nextInt());
        int empCheck = randNum%2;

        if(empCheck == 1){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }
    }

    static void dailyEmpWage(int workHr){
        int wagePerHr = 20;

        System.out.println("Daily Employee wage is "+ workHr*20);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to employee wage calculator");
        empAtt();

        System.out.println("Enter number of hours worked");
        int daily_workHr = scanner.nextInt();
        dailyEmpWage(daily_workHr);
    }
}