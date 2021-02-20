package co.edu.javeriana.calculatorgit;

public class CalculatorCCB implements ICalculator {
    public double add(double a, double b){
        System.out.println(a+b);
        return a+b;
    }
	public double substract (double a, double b){
        System.out.println(a-b);
        return a-b;
    }
	public double multiply (double a, double b){
        System.out.println(a*b);
        return a*b;
    }
	public double divide (double a, double b) throws ArithmeticException {
        double c = a/b;
        System.out.println(c);
        return c;
    }

	public String about() {    
        return ("Calculator implemented by " + Authors.CCB);
    }

}
