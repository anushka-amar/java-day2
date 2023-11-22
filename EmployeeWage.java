import java.util.Random;
public class EmployeeWage{

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
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage calculator");
        empAtt();
    }
}