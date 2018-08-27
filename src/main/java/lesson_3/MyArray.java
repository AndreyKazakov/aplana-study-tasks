package lesson_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArray {

    /**
     * This method reads array size from console, and also asks user to fill the array with string values
     * @return array of Strings
     * @throws NumberFormatException in a case when user enters size of array in incorrect format
     * @throws ArrayIndexOutOfBoundsException in a case when user enters size of array less or equal to 0
     */
    public static String[] readArrayFromConsole() throws NumberFormatException, ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int arraySize = Integer.valueOf(scanner.next().trim());
        if (arraySize <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
            String[] myArray = new String[arraySize];

        System.out.println(String.format("Enter %s words:", arraySize));
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = scanner.next().trim();
        }
        scanner.close();
        return myArray;
    }

    /**
     * This method finds max element (the longest word) in array and shows it and its length in console. If there are several max elements, it shows all of them.
     * @param arr - array of Strings
     */
    public static void findMaxElement(String[] arr) {
        int maxWordSize = 0;
        ArrayList<Integer> resultIndexes = new ArrayList<Integer>(); //this list collects indexes of max elements (in a case array has several max elements)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxWordSize) {
                resultIndexes.add(i);
            }
            if (arr[i].length() > maxWordSize) {
                maxWordSize = arr[i].length();
                resultIndexes.clear();
                resultIndexes.add(i);
            }
        }

        if (resultIndexes.size() == 1) { // if we have only one max element
            System.out.println(String.format("Length of the longest word in array is %s. This word is: %s", maxWordSize, arr[resultIndexes.get(0)]));
        } else { // if we have more than one max element
            System.out.print(String.format("Length of the longest words in array is %s. These words are:", maxWordSize));
            for (int j : resultIndexes) {
                System.out.print(" " + arr[j]);
            }
        }
    }
}
