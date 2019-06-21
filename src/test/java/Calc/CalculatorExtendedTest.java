package Calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorExtendedTest {

    private CalculatorExtended calc;

    @BeforeEach
    public void setup(){
        CalcFactory factory = new CalcFactory();
        calc = (CalculatorExtended) factory.create(false);
    }
    @Test
    public void testSmol(){
        assertEquals(4, calc.sum(2, 2));

    }
    @Test
    public void testSumLarge() {
        assertEquals(6, calc.sum(1,2,3));
    }

}
