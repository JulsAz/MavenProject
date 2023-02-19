import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import week9.Main;

import java.util.Scanner;

public class TestTask {


    @Test
    @Order(1)
    @DisplayName("Граниченое значение 1")
    public void testOne() {
        Scanner scanner = new Scanner("1");
        int result = Main.setNumbers(scanner);
        Assertions.assertEquals(1, result);
    }

    @Test
    @Order(2)
    @DisplayName("Граниченое значение 0")
    public void testTwo() {
        Scanner scanner = new Scanner("0");
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.setNumbers(scanner);
        });
    }

    @Test
    @Order(3)
    @DisplayName("Граниченое значение -1")
    public void testThree() {
        Scanner scanner = new Scanner("-1");
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.setNumbers(scanner);
        });
    }

    @Test
    @Order(4)
    @DisplayName("Положительное целое 5")
    public void testFour() {
        Scanner scanner = new Scanner("5");
        int result = Main.setNumbers(scanner);
        Assertions.assertEquals(15, result);
    }

    @Test
    @Order(5)
    @DisplayName("Положительное с плавующей точкой 3.3")
    public void testFive() {
        Scanner scanner = new Scanner("3.3");
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.setNumbers(scanner);
        });

    }

    @Test
    @Order(6)
    @DisplayName("Символ")
    public void testSix() {
        Scanner scanner = new Scanner("a");
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.setNumbers(scanner);
        });
    }

    @Test
    @Order(7)
    @DisplayName("Пустая строка")
    public void testSeven() {
        Scanner scanner = new Scanner("");
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.setNumbers(scanner);
        });


    }
}
