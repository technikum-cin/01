package Calc;

public class CalcFactory implements CalculatorFactory{
    @Override
    public Calculator create(boolean simple) {
        if(simple)
        {
            return new CalculatorSimple();
        }
        else
        {
            return new CalculatorExtended();
        }
    }
}
