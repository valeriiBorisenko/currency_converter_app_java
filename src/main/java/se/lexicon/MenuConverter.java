package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConverter {

    public static void checkChoise(Currency currencyObj) {

        boolean isActive = true;

        while (isActive) {
            try {
                prntMenu();
                Scanner scanner = new Scanner(System.in);
                int operationNumber = scanner.nextInt();

                switch (operationNumber) {
                    case 1:
                        currencyObj.currencyAmount = 0.09;
                        currencyObj.convertCurrency("USD");
                        break;
                    case 2:
                        currencyObj.currencyAmount = 10.50;
                        currencyObj.convertCurrency("SEK");
                        break;
                    case 3:
                        currencyObj.currencyAmount = 0.08;
                        currencyObj.convertCurrency("Euro");
                        break;
                    case 4:
                        currencyObj.currencyAmount = 11.41;
                        currencyObj.convertCurrency("SEK");
                        break;
                    case 0:
                        isActive = false;
                        System.out.println("Converter closed!");
                        break;
                    default:
                        errorMessage();
                }
            } catch(InputMismatchException e) {
                errorMessage();
            }
        }
    }

    public static void prntMenu() {
        prntMenuLine("1.", "SEK", "USD");
        prntMenuLine("2.", "USD", "SEK");
        prntMenuLine("3.", "SEK", "Euro");
        prntMenuLine("4.", "Euro", "SEK");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }

    private static void prntMenuLine (String position, String cur1, String cur2)  {
        System.out.println(position + " Convert " + cur1 + " to " + cur2);
    }

    private static void errorMessage () {
        Utils.errorMessage("Invalid choice. Please enter a number between 0 - 4");
    }

}
