class Employee extends Person {
    protected double totalSalary;

    protected void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    protected double getTotalSalary() {
        return totalSalary;
    }
}