package Calc;


import java.util.Arrays;

public class CalculatorExtended implements Calculator {

    CalculatorExtended() {}

    @Override
    public int sum(int... numbers) {
        return Arrays.stream(numbers)
                .sum();
    }
}
