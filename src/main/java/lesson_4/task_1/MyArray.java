package lesson_4.task_1;

public class MyArray {

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
        return indexOfMaxNegativeElement; //it returns -1 if array doesn't have negative values
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

        return indexOfMinPositiveElement; //it returns -1 if array doesn't have positive values
    }

    public static int[] replaceElements(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    /**
     * //just shows array in console
     * @param arr
     */
    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    /**
     * Method overload. It shows array in console and highlights elements with indexes specified
     * @param arr - array to be shown
     * @param highlight1 - index of element to highlight
     * @param highlight2 - one more index of element to highlight
     */
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
}
