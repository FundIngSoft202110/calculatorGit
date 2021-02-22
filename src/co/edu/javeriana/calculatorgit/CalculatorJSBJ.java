package co.edu.javeriana.calculatorgit;

// JUan Sebastian Barreto Jimenez

public class CalculatorJSBJ implements ICalculator{
    @Override
	public double add(double a, double b){
        return a + b;
    }// add

    @Override
	public double substract(double a, double b){
        return a - b;
    }// substract

    @Override
	public double multiply(double a, double b){
        return a*b;
    }// multiply

    @Override
	public double divide(double a, double b) throws ArithmeticException{
        return a/b;
    }// divide

	@Override
	public String about(){
        return "Calculadora implementada por " + Authors.JSBJ;
    }// about
}
