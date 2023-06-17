public class CalculatorRunner {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Calculator.add(3,4);
    Calculator.subtract(8,5);
    Calculator.multiply(1,10);
    Calculator.divide(1,10);
        System.out.println("Calculator is not working");
        System.out.println("calculator = " + calculator);
        System.out.println("Some changes made.");
    }
}
