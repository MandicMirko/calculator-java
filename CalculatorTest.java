import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void Sabiranje_dva_broja() {
        String expected = "9.0";
        String actual = Calculator.Run("4+5");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Mnozenje_dva_broja() {
        String expected = "45.0";
        String actual = Calculator.Run("9*5");
        Assertions.assertEquals(expected, actual);
    }

}