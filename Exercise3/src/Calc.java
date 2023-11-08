import java.util.Scanner;

// Calc class
class Calc {
    protected double result;
    protected double operand1;
    protected double operand2;

    protected Calc() {
        result = 0;
        operand1 = 0;
        operand2 = 0;
    }

    protected void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    protected void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    protected double getOperand1() {
        return operand1;
    }

    protected double getOperand2() {
        return operand2;
    }

    protected double addition() {
        result = operand1 + operand2;
        return result;
    }

    protected double subtraction() {
        result = operand1 - operand2;
        return result;
    }

    protected double multiplication() {
        result = operand1 * operand2;
        return result;
    }

    protected double division() {
        if (operand2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        result = operand1 / operand2;
        return result;
    }
}
