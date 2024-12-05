package edu.una.csis.cicd;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public static double calculate(double num1, double num2, int operation) {
        double result = 0;

        switch (operation) {
            case 1: 
                result = num1 + num2;
                break;
            case 2: 
                result = num1 - num2;
                break;
            case 3: 
                result = num1 * num2;
                break;
            case 4: 
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Basic Calculator");
        logger.info("Select an operation:");
        logger.info("1. Add");
        logger.info("2. Subtract");
        logger.info("3. Multiply");
        logger.info("4. Divide");

        int operation = scanner.nextInt();

        logger.info("Enter first number: ");
        double num1 = scanner.nextDouble();
        logger.info("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        try {
            result = calculate(num1, num2, operation);
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.severe("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.severe("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
