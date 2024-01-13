import org.jetbrains.annotations.NotNull;

public class BasicComplexCalculator implements ComplexCalculator{

    public ComplexNumber add(@org.jetbrains.annotations.NotNull ComplexNumber a, @NotNull ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    public ComplexNumber multiply(@NotNull ComplexNumber a, @NotNull ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(@NotNull ComplexNumber a, @NotNull ComplexNumber b) {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        return new ComplexNumber(real, imaginary);
    }
}
