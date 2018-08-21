package lesson_4.task_1;

public class MainProgram {

    public static void main(String[] args) {
        int[] testArray = new int[20]; //creating new array

        //filling array with random values
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = MyArray.getRandomValue(-10, 10);
        }

        //showing array in console
        System.out.print("Initial array: ");
        MyArray.showArray(testArray);

        //detecting Max Negative and Min Positive values and showing them in console
        int indexOfMaxNegativeElement = MyArray.findMaxNegativeElement(testArray);
        int indexOfMinPositiveElement = MyArray.findMinPositiveElement(testArray);
        try {
            System.out.println("Max negative element is: " + testArray[indexOfMaxNegativeElement]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are no negative elements in array!");
        }
        try {
            System.out.println("Min positive element is: " + testArray[indexOfMinPositiveElement]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are no positive elements in array!");
        }

        //showing initial array with Max Negative and Min Positive highlighted
        System.out.print("Initial array with detected MaxNegative and MinPositive: ");
        MyArray.showArray(testArray, indexOfMaxNegativeElement, indexOfMinPositiveElement);

        //replacement of Max Negative and Min Positive values and showing updated array in console with highlights
        try {
            testArray = MyArray.replaceElements(testArray, indexOfMaxNegativeElement, indexOfMinPositiveElement);
            System.out.print("Updated array with replaced MaxNegative and MinPositive: ");
            MyArray.showArray(testArray, indexOfMaxNegativeElement, indexOfMinPositiveElement);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is nothing to replace");
        }

    }
}
