package Calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorSimpletest {

    private Calculator calc;

    @BeforeEach
    public void setup(){
        CalcFactory factory = new CalcFactory();
        calc = (CalculatorSimple) factory.create(true);
    }
    @Test
    public void testSet(){
        assertEquals(4, calc.sum(2, 2));

    }
    @Test
    public void testzero(){
        assertEquals(2, calc.sum(0, 2));

    }
    @Test
    public void testexeption(){
        assertThrows(IllegalArgumentException.class, () -> calc.sum(1, 2, 3));
    }
}