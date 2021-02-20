package co.edu.javeriana.calculatorgit;

/**
 * @author Sebastián Molano
 */
public class CalculatorSMF implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double substract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException {
        return a/b;
    }

    @Override
    public String about() {
        return "Calculadora simple que contiene las 4 operaciones básicas de una calculadora. " + Authors.SMF ;
    }
}
