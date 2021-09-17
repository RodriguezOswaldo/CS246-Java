package cs246.rodriguez;
import java.util.Scanner;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result = " + calc.getResult());
        calc.add(5.0f);
        calc.multiply(3.0f);
        calc.subtract(1.0f);
        calc.divide(2.0f);
        System.out.println("Result = " + calc.getResult());

        Scanner sc = new Scanner((System.in));
        String choice;
        do {
            System.out.println();
            System.out.println("Result = " + calc.getResult());
            System.out.print("Operation (add, substract, multiply, divide, reset, exit): ");
            choice = sc.nextLine();
            if(choice.equals("add")){
                System.out.print("Enter value to add up: ");
                float value = Float.parseFloat(sc.nextLine());
                calc.add(value);
            }else if(choice.equals("substract")){
                System.out.print("Enter value to substract");
                float value = Float.parseFloat(sc.nextLine());
                calc.subtract(value);
            }else if(choice.equals("multiply")){
                System.out.print("Enter value to multiply by");
                float value = Float.parseFloat(sc.nextLine());
                calc.multiply(value);
            }else if(choice.equals("divide")){
                System.out.print("Enter value to divide for");
                float value = Float.parseFloat(sc.nextLine());
                calc.multiply(value);
            }else  if(choice.equals("reset")){
                calc.reset();
            }else if(choice.equals("exit")){
                System.out.println("Good bye");
            }else{
                System.out.println("Invalid Choice.");
            }
        } while (!choice.equals("exit"));
    }
}
