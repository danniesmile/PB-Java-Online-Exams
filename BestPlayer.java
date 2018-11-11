package pavlova;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Best player

        int maxScore = 0;
        String bestPlayer = "";

        while (true) {
            String player = scanner.nextLine();

            if ("END".equals(player)) {
                break;
            }

            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > maxScore) {
                maxScore = goals;
                bestPlayer = player;
            }

            if (goals >= 10) {
                break;
            }


        }
        if (maxScore >= 3) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxScore);

        } else {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals.", maxScore);

        }
    }
}
