package gr.aueb.cf.calcapp;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> numbers = new ArrayList<>();

    public int add(int a, int b) {
        if (a > 0 && b > 0) {
            return a + b;
        } else if (b < 0) {
            return 0;
        } else if (a < 0) {
            return 0;
        } else {
            return 0;
        }
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public void addToList(int num) {
        numbers.add(num);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
