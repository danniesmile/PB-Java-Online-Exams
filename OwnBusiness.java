package pavlova;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Own business

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volumeRoom = width * length * height;
        int computerVolume = 1;
        int sumComputers = 0;
        String input = scanner.nextLine();

        while (true) {
            if ("Done".equals(input)) {
                break;
            }
            int computers = Integer.parseInt(input);
            volumeRoom -= computers;
            if (volumeRoom < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.%n", Math.abs(volumeRoom));
                break;
            }
            input = scanner.nextLine();
        }
        if (volumeRoom > 0) {
            System.out.printf("%d Cubic meters left.", volumeRoom);
        }

    }
}
