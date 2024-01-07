package module2;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Введите первое целое число: ");
            int numerator = scanner.nextInt();

            System.out.print("Введите второе целое число: ");
            int denominator = scanner.nextInt();


            int result = divideNumbers(numerator, denominator);


            System.out.println("Результат деления: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль не имеет смысла!");

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }

    private static int divideNumbers(int numerator, int denominator) {

        if (denominator == 0) {

            throw new ArithmeticException("Деление на ноль!");
        }


        return numerator / denominator;
    }
}
