package third;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("numbers.txt"));

        TreeMap<String, Integer> uniqueNumbers = new TreeMap<>();

        while (scanner.hasNext()) {
            String numberFromFile = scanner.nextLine();
            uniqueNumbers.merge(numberFromFile, 1, (a, b) -> a + b);
        }

        uniqueNumbers.forEach((K, V) -> System.out.println(K + " - libcza wystąpień: " + V));
    }
}
