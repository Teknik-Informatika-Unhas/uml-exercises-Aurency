class AdvancedCalc extends Calc {
    public double modulo(double operand1, double operand2) {
        if (operand2 == 0) {
            System.out.println("Error: Modulo by zero");
            return Double.NaN;
        }
        return operand1 % operand2;
    }
}