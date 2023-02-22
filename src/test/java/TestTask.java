import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import week9.Main;

public class TestTask {


    @Test
    @Order(1)
    @DisplayName("Граниченое значение 1")
    public void testOne() {
        int result = Main.countNumbers(1);
        Assertions.assertEquals(1, result);
    }

    @Test
    @Order(2)
    @DisplayName("Граниченое значение 0")
    public void testTwo() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.verificateNumber("0");
        });
    }

    @Test
    @Order(3)
    @DisplayName("Граниченое значение -1")
    public void testThree() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.verificateNumber("-1");
        });
    }

    @Test
    @Order(4)
    @DisplayName("Положительное целое 5")
    public void testFour() {
        int result = Main.countNumbers(5);
        Assertions.assertEquals(15, result);
    }

    @Test
    @Order(5)
    @DisplayName("Положительное с плавующей точкой 3.3")
    public void testFive() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.verificateNumber("3.3");
        });

    }

    @Test
    @Order(6)
    @DisplayName("Символ")
    public void testSix() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.verificateNumber("a");
        });
    }

    @Test
    @Order(7)
    @DisplayName("Пустая строка")
    public void testSeven() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Main.verificateNumber("");
        });


    }
}
