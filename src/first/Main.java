package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        TreeSet<Integer> randomNumbers = new TreeSet<>();

        int numbersQty = 0;

        while (numbersQty < 50) {
            int randomNumber = random.nextInt(1000);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
                numbersQty++;
            }
        }

        List<Integer> higherThanAverage = new ArrayList<>();
        double average = randomNumbers.stream().collect(Collectors.averagingInt(Integer::valueOf));

        for (Integer randomNumber : randomNumbers) {
            if (randomNumber > average) {
                higherThanAverage.add(randomNumber);
            }
        }
        System.out.println("Wszystkie: " + randomNumbers);
        System.out.println("Największa: " + randomNumbers.last());
        System.out.println("Najmniejsza: " + randomNumbers.first());
        System.out.println("Srednia: " + average);
        System.out.println("Liczby większe od średniej: " + higherThanAverage);
    }
}
