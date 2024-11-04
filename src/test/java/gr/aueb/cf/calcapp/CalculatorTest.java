package gr.aueb.cf.calcapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        int a = 10, b = 20;
        int a1 = -10;

        int expected = 30;
        int expected1 = 0;

        int actual = calc.add(a, b);
        int actual1 = calc.add(a1, b);

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }

    @Test
    void sub() {
        Calculator calc = new Calculator();
        int a = 10, b = 20;

        int expected = -10;
        int actual = calc.sub(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void addToList() {
        var calc = new Calculator();
        calc.addToList(5);

        assertEquals(1, calc.getNumbers().size());

    }
}