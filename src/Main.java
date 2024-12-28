import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    static Scanner myObj = new Scanner(System.in);

    public static void operations() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        System.out.println("5. Square");
        System.out.println("6. Square root");
        System.out.println("7. Cube");
        System.out.println("8. Cube root");
        System.out.println("9. Power");
        System.out.println("10. Factorial");
        System.out.println("11. Sin");
        System.out.println("12. Cos");
        System.out.println("13. Tan");
        System.out.println("14. Cot");
        System.out.println("15. Sec");
        System.out.println("16. Cosec");
        System.out.println("17. Log");
        System.out.println("18. Ln");
        System.out.println("19. Operations List");
        System.out.println("20. Exit");
    }

    public static void user_input(int choice) {
        int a, b;
        switch (choice) {
            case 1:
                System.out.println("Enter two numbers: ");
                a = myObj.nextInt();
                b = myObj.nextInt();
                System.out.println("Sum is -: " + (a + b));
                break;
            case 2:
                System.out.println("Enter two numbers: ");
                a = myObj.nextInt();
                b = myObj.nextInt();
                System.out.println("Difference is -: " + (a - b));
                break;
            case 3:
                System.out.println("Enter two numbers: ");
                a = myObj.nextInt();
                b = myObj.nextInt();
                System.out.println("Multiplication is -: " + (a * b));
                break;
            case 4:
                System.out.println("Enter two numbers: ");
                a = myObj.nextInt();
                b = myObj.nextInt();
                if (b != 0) {
                    System.out.println("Division is -: " + ((double) a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                System.out.println("Enter one number: ");
                a = myObj.nextInt();
                System.out.println("Square is -: " + (a * a));
                break;
            case 6:
                System.out.println("Enter one number: ");
                a = myObj.nextInt();
                System.out.println("Square root is -: " + sqrt(a));
                break;
            case 7:
                System.out.println("Enter one number: ");
                a = myObj.nextInt();
                System.out.println("Cube is -: " + (a * a * a));
                break;
            case 8:
                System.out.println("Enter one number: ");
                a = myObj.nextInt();
                System.out.println("Cube root is -: " + cbrt(a));
                break;
            case 9:
                System.out.println("Enter two numbers: ");
                a = myObj.nextInt();
                b = myObj.nextInt();
                System.out.println("Power is -: " + pow(a, b));
                break;
            case 10:
                System.out.println("Enter one number: ");
                a = myObj.nextInt();
                int fact = 1;
                for (int i = 1; i <= a; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial is -: " + fact);
                break;
            case 11:
                System.out.println("Enter angle in degrees: ");
                a = myObj.nextInt();
                System.out.println("Sin value is -: " + sin(toRadians(a)));
                break;
            case 12:
                System.out.println("Enter angle in degrees: ");
                a = myObj.nextInt();
                System.out.println("Cos value is -: " + cos(toRadians(a)));
                break;
            case 13:
                System.out.println("Enter angle in degrees: ");
                a = myObj.nextInt();
                System.out.println("Tan value is -: " + tan(toRadians(a)));
                break;
            case 14:
                System.out.println("Enter angle in degrees: ");
                a = myObj.nextInt();
                if (tan(toRadians(a)) != 0) {
                    System.out.println("Cot value is -: " + (1 / tan(toRadians(a))));
                } else {
                    System.out.println("Cot is undefined at this angle.");
                }
                break;
            case 15:
                System.out.println("Enter angle in degrees: ");
                a = myObj.nextInt();
                if (cos(toRadians(a)) != 0) {
                    System.out.println("Sec value is -: " + (1 / cos(toRadians(a))));
                } else {
                    System.out.println("Sec is undefined at this angle.");
                }
                break;
            case 16:
                System.out.println("Enter angle in degrees: ");
                a = myObj.nextInt();
                if (sin(toRadians(a)) != 0) {
                    System.out.println("Cosec value is -: " + (1 / sin(toRadians(a))));
                } else {
                    System.out.println("Cosec is undefined at this angle.");
                }
                break;
            case 17:
                System.out.println("Enter one number: ");
                a = myObj.nextInt();
                System.out.println("Log value is -: " + log10(a));
                break;
            case 18:
                System.out.println("Enter one number: ");
                a = myObj.nextInt();
                System.out.println("Natural Log (ln) value is -: " + log(a));
                break;
            case 19:
                operations();
                break;
            default:
                System.out.println("Invalid Arguments");
                break;
        }
    }

    public static void main(String[] args) {
        boolean running  = true;
        operations();
        System.out.println("Enter your choice -: ");
        while (running)
        {
            int choice = myObj.nextInt();
            if(choice == 20)
            {
                System.out.println("Exiting... Thank you for using the calculator.");
                break;
            }
            user_input(choice);
            System.out.println("Enter your choice -: ");
        }
        System.out.println("Thank you for using the calculator!");
    }
}
