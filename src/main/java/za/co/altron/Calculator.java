package za.co.altron;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition:\t" + calculator.add(6, 10));
        System.out.println("Multiplication:\t" + calculator.multiply(6, 10));
    }

    public int add(int x, int y){
        return x + y;
    }

    public int multiply(int x, int y){
        return x * y;
    }
}
