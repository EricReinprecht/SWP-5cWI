package calculator;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         this.calc = new Calculator();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        double result = calc.add(3, 4);
        Assertions.assertEquals(7, result);
    }

    @org.junit.jupiter.api.Test
    void substract() {
        double result = calc.substract(3, 4);
        Assertions.assertEquals(-1, result);
    }
}