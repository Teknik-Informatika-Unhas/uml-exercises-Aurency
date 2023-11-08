import java.util.Scanner;
public class AdvancedCalcAction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Advanced Calculator----------");
        System.out.println("For Addition, press 1");
        System.out.println("For Subtraction, press 2");
        System.out.println("For Multiplication, press 3");
        System.out.println("For Division, press 4");
        System.out.println("For Modulo, press 5");
        System.out.println("For Exit, press 0");
        System.out.println("--------------------------------------------");

        AdvancedCalc calculator = new AdvancedCalc();
        int choice;

        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.print("Enter First Number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter Second Number: ");
            double num2 = scanner.nextDouble();

            calculator.setOperand1(num1);
            calculator.setOperand2(num2);

            switch (choice) {
                case 1:
                    System.out.println(num1 + "+" + num2 + "=" + calculator.addition());
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + "=" + calculator.subtraction());
                    break;
                case 3:
                    System.out.println(num1 + "*" + num2 + "=" + calculator.multiplication());
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + "=" + calculator.division());
                    break;
                case 5:
                    System.out.println(num1 + "%" + num2 + "=" + calculator.modulo(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("==========================");
        } while (choice != 0);

        System.out.println("Calculator exited.");
    }
}