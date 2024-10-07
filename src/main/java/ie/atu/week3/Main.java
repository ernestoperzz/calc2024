package ie.atu.week3;



import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan1= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered "+ firstNum);


        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        String operation;
        System.out.println("Enter the option");
        operation = scan1.next();

        //Ask the user for operation

        boolean validOperation =true;
        switch(operation){
            case "addition":
                add(firstNum,secondNum);
                break;
            case "subtraction":
                subtract(firstNum,secondNum);
                break;
            case "multiplication":
                multiply(firstNum,secondNum);
                break;
            case "division":
                divide(firstNum,secondNum);
                break;
            case "exponential":
                exponential(firstNum,secondNum);
                break;
            default:
                System.out.println("Invalid operation. ");
                break;
        }
    }
    public static void add(double first, double second){
        double result = first + second;
        System.out.println("The total is "+result);
    }

    public static void subtract(double first, double second){
        double result = first - second;
        System.out.println("The total is "+ result);
    }
    public static void multiply(double first, double second){
        double result = first * second;
        System.out.println("The total is "+ result);
    }
    public static void divide(double first, double second){
        double result = first/second;
        System.out.println("The total is "+ result);
    }
    public static void exponential(double first, double second){
        double result = Math.pow(first, second);
        System.out.println("The total is "+ result);
    }


}






