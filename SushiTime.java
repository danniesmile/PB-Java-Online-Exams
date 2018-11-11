package pavlova;

import java.util.Scanner;

public class SushiTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sortSushi = scanner.nextLine();
        String restaurantName = scanner.nextLine();
        int countServing = Integer.parseInt(scanner.nextLine());
        String order = scanner.nextLine();

        double dishPrice = 0;
        double deliveryPrice = 0;
        double finalPrice = 0;

        if ("Sushi Zone".equals(restaurantName)) {

            if ("sashimi".equals(sortSushi)) {
                dishPrice = 4.99;
            } else if ("maki".equals(sortSushi)) {
                dishPrice = 5.29;
            } else if ("uramaki".equals(sortSushi)) {
                dishPrice = 5.99;
            } else if ("temaki".equals(sortSushi)) {
                dishPrice = 4.29;
            }

            double priceSum = countServing * dishPrice;
            if ("Y".equals(order)) {
                deliveryPrice = priceSum * 0.20;
                finalPrice = Math.ceil(priceSum + deliveryPrice);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            } else {
                finalPrice = Math.ceil(priceSum);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            }
        } else if ("Sushi Time".equals(restaurantName)) {

            if ("sashimi".equals(sortSushi)) {
                dishPrice = 5.49;
            } else if ("maki".equals(sortSushi)) {
                dishPrice = 4.69;
            } else if ("uramaki".equals(sortSushi)) {
                dishPrice = 4.49;
            } else if ("temaki".equals(sortSushi)) {
                dishPrice = 5.19;
            }

            double priceSum = countServing * dishPrice;
            if ("Y".equals(order)) {
                deliveryPrice = priceSum * 0.20;
                finalPrice = Math.ceil(priceSum + deliveryPrice);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            } else {
                finalPrice = Math.ceil(priceSum);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            }
        } else if ("Sushi Bar".equals(restaurantName)) {

            if ("sashimi".equals(sortSushi)) {
                dishPrice = 5.25;
            } else if ("maki".equals(sortSushi)) {
                dishPrice = 5.55;
            } else if ("uramaki".equals(sortSushi)) {
                dishPrice = 6.25;
            } else if ("temaki".equals(sortSushi)) {
                dishPrice = 4.75;
            }

            double priceSum = countServing * dishPrice;
            if ("Y".equals(order)) {
                deliveryPrice = priceSum * 0.20;
                finalPrice = Math.ceil(priceSum + deliveryPrice);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            } else {
                finalPrice = Math.ceil(priceSum);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            }
        } else if ("Asian Pub".equals(restaurantName)) {

            if ("sashimi".equals(sortSushi)) {
                dishPrice = 4.50;
            } else if ("maki".equals(sortSushi)) {
                dishPrice = 4.80;
            } else if ("uramaki".equals(sortSushi)) {
                dishPrice = 5.50;
            } else if ("temaki".equals(sortSushi)) {
                dishPrice = 5.50;
            }

            double priceSum = countServing * dishPrice;
            if ("Y".equals(order)) {
                deliveryPrice = priceSum * 0.20;
                finalPrice = Math.ceil(priceSum + deliveryPrice);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            } else {
                finalPrice = Math.ceil(priceSum);
                System.out.printf("Total price: %.0f lv.", finalPrice);
            }

        } else {
            System.out.printf("%s is invalid restaurant!", restaurantName);
        }

    }
}


