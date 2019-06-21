package Calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("integration")
public class CalculatorFactoryTest {

    private CalculatorFactory factory;

    @BeforeEach
    public void setUp() {
        factory = new CalcFactory();
    }

    @Test
    public void testSimpleFactory() {
        Calculator calc = factory.create(true);
        assertTrue(calc.getClass() == CalculatorSimple.class);
    }

    @Test
    public void testExtendedFactory() {
        Calculator calc = factory.create(false);
        assertTrue(calc.getClass() == CalculatorExtended.class);
    }
}