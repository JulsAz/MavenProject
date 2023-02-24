import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import week9.Main;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestTask {


    @Test
    @Order(1)
    @DisplayName("Граниченое значение 1")
    public void testOne() {
        int result = Main.countNumbers(1);
        assertThat(Main.countNumbers(1))
                .isEqualTo(result);
    }

    @Test
    @Order(2)
    @DisplayName("Граниченое значение 0")
    public void testTwo() {
        assertThatThrownBy(() -> {
            Main.verificateNumber("0");
        })
                .isInstanceOf(RuntimeException.class)
                .hasMessage(Main.errorMessage);
    }

    @Test
    @Order(3)
    @DisplayName("Граниченое значение -1")
    public void testThree() {
        assertThatThrownBy(() -> {
            Main.verificateNumber("-1");
        })
                .isInstanceOf(RuntimeException.class)
                .hasMessage(Main.errorMessage);
    }

    @Test
    @Order(4)
    @DisplayName("Положительное целое 5")
    public void testFour() {
        int result = Main.countNumbers(5);
        assertThat(Main.countNumbers(5))
                .isEqualTo(15);
    }

    @Test
    @Order(5)
    @DisplayName("Положительное с плавующей точкой 3.3")
    public void testFive() {
        assertThatThrownBy(() -> {
            Main.verificateNumber("3.3");
        })
                .isInstanceOf(RuntimeException.class)
                .hasMessage(Main.errorMessage);
    }

    @Test
    @Order(6)
    @DisplayName("Символ")
    public void testSix() {
        assertThatThrownBy(() -> {
            Main.verificateNumber("ф");
        })
                .isInstanceOf(RuntimeException.class)
                .hasMessage(Main.errorMessage);
    }

    @Test
    @Order(7)
    @DisplayName("Пустая строка")
    public void testSeven() {
        assertThatThrownBy(() -> {
            Main.verificateNumber("");
        })
                .isInstanceOf(RuntimeException.class)
                .hasMessage(Main.errorMessage);
    }

    @Test
    @Order(8)
    @DisplayName("Null")
    public void testEight() {
        assertThatThrownBy(() -> {
            Main.verificateNumber(null);
        })
                . isInstanceOf(RuntimeException.class)
                .hasMessage(Main.errorMessage);
    }
}
