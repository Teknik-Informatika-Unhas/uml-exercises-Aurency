class Monthly extends Employee {
    private int numberOfAbsent;
    private double salaryPerMonth;

    public Monthly(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public void calculateSalary() {
        double deduction = (numberOfAbsent / 30.0) * salaryPerMonth;
        setTotalSalary(salaryPerMonth - deduction);
    }

    public void addAbsent(int days) {
        numberOfAbsent += days;
    }
}