package pavlova;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double spaceshipWidth = Double.parseDouble(scanner.nextLine());
        double spaceshipLength = Double.parseDouble(scanner.nextLine());
        double spaceshipHeight = Double.parseDouble(scanner.nextLine());
        double mediumHeightOfAstronauts = Double.parseDouble(scanner.nextLine());

        double volumeSpaceship = spaceshipWidth * spaceshipLength * spaceshipHeight;
        double volumeOneRoom = (mediumHeightOfAstronauts + 0.40) * 2 * 2;

        double enoughPlace = Math.floor(volumeSpaceship / volumeOneRoom);

        if (enoughPlace >= 3 && enoughPlace <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", enoughPlace);
        } else if (enoughPlace < 3) {
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
