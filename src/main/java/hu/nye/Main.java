package hu.nye;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public final class Main
{
    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int  MULTIPLY= 3;
    private static final int DIVIDE = 4;

    public static void main(final String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter number two: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter operator: ");
        int operator = scanner.nextInt();
        switch (operator) {
            case ADD -> System.out.println("Result: "+(numberOne + numberTwo));
            case SUBTRACT -> System.out.println("Result: "+(numberOne - numberTwo));
            case MULTIPLY -> System.out.println("Result: "+(numberOne * numberTwo));
            case DIVIDE -> System.out.println("Result: "+(numberOne / numberTwo));
            default -> System.out.println("Invalid operator.");

        }



    }
}
