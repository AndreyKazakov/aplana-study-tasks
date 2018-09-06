package lesson_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        File file = new File("src\\main\\resources\\example_text.txt");

        {
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    System.out.println(scanner.next().replaceAll("\\s*([,,.,;,:,!,?,(,)])\\s*", "").toLowerCase());
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

}
