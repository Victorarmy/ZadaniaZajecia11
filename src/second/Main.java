package second;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static final int MAX_USER_INPUTS = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> userInput = new LinkedList<>();

        int sum = 0;

        for (int i = 0; i < MAX_USER_INPUTS; i++) {
            System.out.println("Podaj liczbe: ");
            int userNumber = scanner.nextInt();
            sum += userNumber;
            userInput.offer(userNumber);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < MAX_USER_INPUTS; i++) {
            stringBuilder.append(userInput.poll() + " + ");
        }

        stringBuilder.replace(stringBuilder.lastIndexOf("+"), stringBuilder.lastIndexOf("+") + 1, "=");
        stringBuilder.append(sum);
        System.out.println(stringBuilder.toString());
    }
}
