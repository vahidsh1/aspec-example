package ir.bki.aspect;
import ir.bki.aspect.Calculator;

public class Main {
    public static void main(String[] args) {
        int sum = Calculator.add(41, 42);
        System.out.println("====== The sum is: " + sum);

        System.out.println();

//        int quotient = Calculator.divide(42, 0);
//        System.out.println("====== The quotient is: " + quotient);
    }
}
