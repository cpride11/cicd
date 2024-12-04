package edu.una.csis.cicd;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Basic Calculator");
        logger.info("Select an operation:");
        logger.info("1. Add");
        logger.info("2. Subtract");
        logger.info("3. Multiply");
        logger.info("4. Divide");
        logger.info("4. Divide");

        int operation = scanner.nextInt();

        logger.info("Enter first number: ");
        double num1 = scanner.nextDouble();
        logger.info("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case 1 -> {
                result = num1 + num2;
                logger.info("Result: " + result);
            }
            case 2 -> {
                result = num1 - num2;
                logger.info("Result: " + result);
            }
            case 3 -> {
                result = num1 * num2;
                logger.info("Result: " + result);
            }
            case 4 -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    logger.info("Result: " + result);
                } else {
                    logger.severe("Error: Cannot divide by zero.");
                    logger.severe("Error: Cannot divide by zero.");
                }
            }
            default -> {
                logger.warning("Invalid operation.");
                logger.warning("Invalid operation.");
            }
        }

        scanner.close();
    }
}