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
        System.out.println("Daily Employee wage is "+ workHr*wagePerHr);
    }

    static void partWage(int workHr){
        String partEmp = "Jane doe";
        int wagePerHr = 12;
        System.out.println("The part time employee is "+partEmp+" and her daily wage is "+ wagePerHr*workHr);

    }

    static void mothlyWageCalc(String emp_type){
        int emp_hrs = 0, emp_wage = 0, wagePerDay=0, totalMonthlyWage = 0;
        for(int day = 0; day<20; day++){
            switch (emp_type){
                case "part":
                    emp_hrs = 4;
                    emp_wage = 12;
                    break;

                case "full":
                    emp_hrs = 8;
                    emp_wage = 20;
                    break;

                default:
                    System.out.println("INVALID");
                    break;
            }
            wagePerDay = emp_hrs*emp_wage;
            totalMonthlyWage += wagePerDay;
        }
        System.out.println("Monthly wage of "+emp_type+"-time employee is "+totalMonthlyWage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to employee wage calculator");

        empAtt();


        dailyEmpWage(8);

        System.out.println("Enter if you are a part-time employee or full-time employee");
        String emp_type = scanner.nextLine();
        switch (emp_type){
            case "part":
                System.out.println("Enter number of hours worked");
                int work_hr = scanner.nextInt();
                partWage(work_hr);
                break;

            case "full":
                dailyEmpWage(8);
                break;

            default:
                System.out.println("INVALID");
                break;
        }

        mothlyWageCalc(emp_type);
    }
}