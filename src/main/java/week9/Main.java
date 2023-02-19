//1. Напишите программу, где пользователь вводит любое целое положительное
// число. А программа суммирует все числа от 1 до введенного пользователем числа.
// Если введено некорректное число, программа должна генерировать RuntimeException.
//2. Сделать тестовый класс, в котором покрыть возможные кейсы тестами"

package week9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(setNumbers(new Scanner(System.in)));
        System.out.println(setNumbers(new Scanner("2")));
    }

    public static int setNumbers(Scanner sc) {
        System.out.println("Введите целое положительное число:");
        Scanner scanner = sc;

        int startNumber = 1;
        int result = 0;
        String errorMessage = "Некорректное число";

        try {
            String stringNumber = scanner.nextLine();

            int numberTo = Integer.parseInt(stringNumber);
            if (numberTo > 0) {
                while (startNumber <= numberTo) {
                    result = result + startNumber;
                    startNumber++;
                }
                return result;
            } else {
                throw new RuntimeException(errorMessage);
            }
        } catch (InputMismatchException | NumberFormatException e) {
            throw new RuntimeException(errorMessage);
        }
    }
}
