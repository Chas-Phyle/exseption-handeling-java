import java.util.Scanner;

public class Module3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first of two numbers to divide!");
        int firstNumber = keyboard.nextInt();
        System.out.println("Enter the second number to divide by!");
        int secondNumber = keyboard.nextInt();
        int a = firstNumber;
        int b = secondNumber;
        try {
            double test = a / b;
            double test2 = (double) a / b; // its interesting when I don't have them as int it convers the answer to
                                           // infinity
            System.out.print(a + "/" + b + "= ");
            System.out.printf("%.2f", test2);

        } catch (ArithmeticException ae) {
            System.out.println("Please do not divde by 0");

        }

    }
}
