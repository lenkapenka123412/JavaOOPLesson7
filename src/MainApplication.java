import java.util.Scanner;
import java.util.logging.Logger;

public class MainApplication {
    public static void main(String[] args) {
        LoggerConfigurator.configureLogger("calculator.log");
        Logger LoggerFactory = null;
        ComplexCalculatorLogger calculatorLogger = new ComplexCalculatorLogger(Logger.getLogger(String.valueOf(ComplexCalculatorLogger.class)));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите действительную и мнимую части первого комплексного числа:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);

        System.out.println("Введите действительную и мнимую части второго комплексного числа:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        ComplexCalculator calculator = new BasicComplexCalculator();
        ComplexCalculatorFacade calculatorFacade = new ComplexCalculatorFacade(calculator, calculatorLogger);

        calculatorFacade.performOperations(num1, num2);
    }
}
