import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Type your first name: ");
        String firstName = console.next();

        System.out.println("Type your last name: ");
        String lastName = console.next();

        printNameLength(firstName);
        printLastNameLength(lastName);
        printNameCharacters(firstName);
        printLastNameCharacters(lastName);
        printFullName(firstName, lastName);

        console.close();
    } //main

    private static void printNameLength(String name) {
        int length = name.length();
        System.out.println("Your name has: " + length + " letters");
    } // name length

    private static void printNameCharacters(String name) {
        System.out.println("The letters of your name are: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    } //name characters

    private static void printLastNameLength(String lastName) {
        int length = lastName.length();
        System.out.println("Your last name has: " + length + " letters");
    } // last name length

    private static void printLastNameCharacters(String lastName) {
        System.out.println("The letters of your last name are: ");
        for (int i = 0; i < lastName.length(); i++) {
            System.out.println(lastName.charAt(i));
        }
    } // last name characters

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Your full name is: " + firstName + " " + lastName);
    } //print full name
}
