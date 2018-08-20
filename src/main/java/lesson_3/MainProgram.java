package lesson_3;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for using Calculator, enter 2 for Searching max element in array:");
        String selection = scanner.next().trim();

        switch (selection) {
            case "1":
                Calculator calculator = new Calculator(); // creates object of a calculator
                calculator.performCalculation();
                break;
            case "2":
                try {
                    String[] testArray = MyArray.readArrayFromConsole(); //create array using method from MyArray class
                    MyArray.findMaxElement(testArray); //find max element(s) in specified array using method from MyArray class
                } catch (NumberFormatException nfe) {
                    System.out.println("Array size has been entered in incorrect format");
                } catch (ArrayIndexOutOfBoundsException oob) {
                    System.out.println("Array size should be more than 0");
                }
                break;
            default:
                System.out.println("Not available selection");
        }
    }
}