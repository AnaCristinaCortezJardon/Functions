import java.util.Scanner;

public class CalculatorBrain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number1 = console.nextInt();
        System.out.println("Type a second number: ");
        int number2 = console.nextInt();

        Operations(number1, number2);

        console.close();
    } //main

    private static void Operations(int number1, int number2) {
        System.out.println("Adition: " + add(number1, number2));
        System.out.println("Substraction: " +subtract(number1, number2));
        System.out.println("Multiplication: " + multiply(number1, number2));
        System.out.println("Division: " + divide(number1, number2));
    } //operations

    private static int add(int a, int b) {
        return a + b;
    }//suma

    private static int subtract(int a, int b) {
        return a - b;
    }//resta

    private static int multiply(int a, int b) {
        return a * b;
    }//multiplicación

    private static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("You can't make a division using zero!");
        }
		return 0; //¿cómo hacer que regrese NaN o imposible o error?
    }//división
}//class
