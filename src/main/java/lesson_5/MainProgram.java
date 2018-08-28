package lesson_5;

public class MainProgram {
    public static void main(String[] args) {
        Reader reader = new Reader();
        double result;

        try {
            reader.readDataFromConsole(); //reads data from console
        } catch (NumberFormatException nfe) {
            System.out.println("The number has incorrect format");
            return;
        }
    }
}
