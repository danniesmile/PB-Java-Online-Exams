package pavlova;

import java.util.Scanner;

public class GroupStage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTeam = scanner.nextLine();
        int countGames = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int counter = countGames;
        int allScored = 0;
        int allReceived = 0;
        int diff = 0;

        while (counter > 0) {
            int scoredGoals = Integer.parseInt(scanner.nextLine());
            int receivedGoals = Integer.parseInt(scanner.nextLine());

            allScored += scoredGoals;
            allReceived += receivedGoals;
            diff += (scoredGoals - receivedGoals);

            if (scoredGoals > receivedGoals) {
                points += 3;
            } else if (scoredGoals == receivedGoals) {
                points += 1;
            }

            counter--;
        }
        if (allScored >= allReceived) {
            System.out.printf("%s has finished the group phase with %d points.%n", nameTeam, points);
        } else {
            System.out.printf("%s has been eliminated from the group phase.%n", nameTeam);
        }
        System.out.printf("Goal difference: %d.", diff);
    }
}
