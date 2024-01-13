public class ComplexCalculatorFacade {
    private final ComplexCalculator calculator;
    private final ComplexCalculatorLogger logger;

    public ComplexCalculatorFacade(ComplexCalculator calculator, ComplexCalculatorLogger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    public void performOperations(ComplexNumber a, ComplexNumber b) {
        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);

        logger.logCalculation("Addition", sum);
        logger.logCalculation("Multiplication", product);
        logger.logCalculation("Division", quotient);
    }
}
