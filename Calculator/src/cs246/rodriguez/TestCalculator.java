package cs246.rodriguez;

public class TestCalculator {

    public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Result = " + calc.getResult());
    calc.add(5.0f);
    calc.multiply(3.0f);
    calc.subtract(1.0f);
    calc.divide(2.0f);
    System.out.println("Result = "+ calc.getResult());
    }

}
