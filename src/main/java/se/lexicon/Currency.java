package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Currency {

    double currencyAmount;

    public void convertCurrency (String currencyType) {
        System.out.println("Result: " + multiply() + " " + currencyType);
        Date.prntDateTime();
        Utils.outLine();
    }

    private double multiply () {
        return checkCurrency() * currencyAmount;
    }

    public double checkCurrency () {
        enterAmountMessage();
        Scanner scanner = new Scanner(System.in);
        double number = 0;

        boolean validNumber = false;

        while (!validNumber) {
            try {
                number = scanner.nextDouble();

                if (number > 0) {
                    validNumber = true;
                } else {
                    errorMessage("Please enter an amount greater than 0");
                }
            } catch (InputMismatchException e) {
                errorMessage("Non-numeric values are unacceptable.");
                scanner.next();
            }
        }
        return number;
    }

    private static void enterAmountMessage() {
        System.out.println("Please, enter your amount:");
    }

    private static void errorMessage(String message) {
        Utils.errorMessage("Error: " + message);
    }
}
