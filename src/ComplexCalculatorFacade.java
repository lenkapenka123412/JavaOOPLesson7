import java.util.logging.Logger;

public class ComplexCalculatorFacade {
    private static Logger LoggerFactory;
    private static final Logger logger = LoggerFactory.getLogger(String.valueOf(ComplexCalculatorFacade.class));

    private final ComplexCalculator calculator;

    public ComplexCalculatorFacade(ComplexCalculator calculator) {
        this.calculator = calculator;
    }

    public void performOperations(ComplexNumber a, ComplexNumber b) {
        logger.info("Выполнение операций над комплексными числами:");
        logger.info("Номер 1: {}");
        logger.info("Номер 2: {}");

        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);

        logger.info("Сумма: {}");
        logger.info("Произведение: {}");
        logger.info("Частное: {}");
    }
}
