public class PersonInAction {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mario");
        student.setAddress("Jl. Mahoni");
        student.setCampus("Campus ABC");

        Monthly monthlyEmployee = new Monthly(3000.0);
        monthlyEmployee.setName("Law");
        monthlyEmployee.setAddress("Jl. Nangka.");
        monthlyEmployee.addAbsent(5);
        monthlyEmployee.calculateSalary();

        Hourly hourlyEmployee = new Hourly(15.0);
        hourlyEmployee.setName("Nadya");
        hourlyEmployee.setAddress("Jl.Jalan");
        // Implement the addition of hours worked for the hourly employee.

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Campus: " + student.getCampus());

        System.out.println("Employee Name: " + monthlyEmployee.getName());
        System.out.println("Employee Address: " + monthlyEmployee.getAddress());
        System.out.println("Total Salary: $" + monthlyEmployee.getTotalSalary());

        System.out.println("Employee Name: " + hourlyEmployee.getName());
        System.out.println("Employee Address: " + hourlyEmployee.getAddress());
        System.out.println("Total Salary: $" + hourlyEmployee.getTotalSalary());
    }
}