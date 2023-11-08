public class StudentsCard2 {
    public static void main(String[] args) {

        Students2 student = new Students2("A11.2012.0001");

        student.setNama("Si Adin");

        System.out.println("Student Name = " + student.getNama());
        System.out.println("Student Number Format = xxx.xxxx.xxxxx");
        System.out.println("Student Number = " + student.getNIM());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Student Name: " + student.getNama());
        System.out.println("Student Number: " + student.getNIM());
    }
}