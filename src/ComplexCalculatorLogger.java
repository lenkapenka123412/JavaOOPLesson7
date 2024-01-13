import java.util.logging.Logger;

public class ComplexCalculatorLogger {
    private final Logger logger;

    public ComplexCalculatorLogger(Logger logger) {
        this.logger = logger;
    }

    public void logCalculation(String operation, ComplexNumber result) {
        logger.info("{} result: {}");
    }

}
