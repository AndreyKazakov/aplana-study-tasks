package lesson_4.task_1;

public class MainProgram {

    private int[] testArray;

    public static int getRandomValue(int valueFrom, int valueTo) {
        int result = (int) (Math.random() * (valueTo - valueFrom + 1)) + valueFrom;
        return result;
    }

    public static int findMaxNegativeElement(int[] arr) {
        boolean isFirstNegativeElementFound = false;
        int maxNegativeElement = 0;
        int indexOfMaxNegativeElement = -1;

        for (int i = 0; i < arr.length; i++) {
            if (!isFirstNegativeElementFound && (arr[i] < 0)) {
                maxNegativeElement = arr[i];
                indexOfMaxNegativeElement = i;
                isFirstNegativeElementFound = true;
                continue;
            }
            if ((arr[i] < 0) && (arr[i] > maxNegativeElement)) {
                maxNegativeElement = arr[i];
                indexOfMaxNegativeElement = i;
            }
        }

        if (indexOfMaxNegativeElement == -1) {
            System.out.println("There are no negative elements in array!");
        }
        return indexOfMaxNegativeElement;
    }

    public static int findMinPositiveElement(int[] arr) {
        boolean isFirstPositiveElementFound = false;
        int minPositiveElement = 0;
        int indexOfMinPositiveElement = -1;

        for (int i = 0; i < arr.length; i++) {
            if (!isFirstPositiveElementFound && (arr[i] > 0)) {
                minPositiveElement = arr[i];
                indexOfMinPositiveElement = i;
                isFirstPositiveElementFound = true;
                continue;
            }
            if ((arr[i] > 0) && (arr[i] < minPositiveElement)) {
                minPositiveElement = arr[i];
                indexOfMinPositiveElement = i;
            }
        }

        if (indexOfMinPositiveElement == -1) {
            System.out.println("There are no positive elements in array!");
        }
        return indexOfMinPositiveElement;
    }

    public static int[] replaceElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void showArray(int[] arr, int highlight1, int highlight2) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == highlight1) || (i == highlight2)) {
                System.out.print("\033[0;32m" + arr[i] + "\033[0m" + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] testArray = new int[20];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = getRandomValue(-10, 10);
        }

        System.out.print("Initial array: ");
        showArray(testArray);

        int indexOfMaxNegativeElement = findMaxNegativeElement(testArray);
        int indexOfMinPositiveElement = findMinPositiveElement(testArray);
        System.out.println("Max negative element is: " + testArray[indexOfMaxNegativeElement]);
        System.out.println("Min positive element is: " + testArray[indexOfMinPositiveElement]);

        System.out.print("Initial array with detected MaxNegative and MinPositive: ");
        showArray(testArray, indexOfMaxNegativeElement, indexOfMinPositiveElement);

        int[] updatedArray = replaceElements(testArray, indexOfMaxNegativeElement, indexOfMinPositiveElement);
        System.out.print("Updated array with replaced MaxNegative and MinPositive: ");
        showArray(updatedArray, indexOfMaxNegativeElement, indexOfMinPositiveElement);

    }
}
