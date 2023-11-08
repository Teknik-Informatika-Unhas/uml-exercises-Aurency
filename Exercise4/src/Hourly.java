class Hourly extends Employee {
    private double salaryPerHour;

    public Hourly(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void calculateSalary() {
        // Hourly employees are paid for actual hours worked, no deductions.
        setTotalSalary(salaryPerHour);
    }

    public void addHour(float hoursWorked) {
        // Implement this method to add the hours worked by the hourly employee.
    }
}