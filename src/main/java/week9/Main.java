//1. Напишите программу, где пользователь вводит любое целое положительное
// число. А программа суммирует все числа от 1 до введенного пользователем числа.
// Если введено некорректное число, программа должна генерировать RuntimeException.
//2. Сделать тестовый класс, в котором покрыть возможные кейсы тестами"

package week9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String errorMessage = "Некорректное число";

    public static void main(String[] args) {
        String enteredNumber = getUserNumber();
        int verificatedNumber = verificateNumber(enteredNumber);
        int countedNumber = countNumbers(verificatedNumber);
        System.out.println(countedNumber);
    }

    public static String getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        String userNumberS = scanner.nextLine();
        return userNumberS;
    }

    public static int verificateNumber(String userNumberS) {
        try {
            int userNumber = Integer.parseInt(userNumberS);
            if (userNumber > 0) {
                return userNumber;
            } else {
                throw new RuntimeException(errorMessage);
            }
        } catch (InputMismatchException | NumberFormatException e) {
            throw new RuntimeException(errorMessage);
        }
    }

    public static int countNumbers(int userNumber) {
        int result = 0;

        for (int i = 1; i <= userNumber; i++) {
            result = result + i;
        }
        return result;
    }
}
