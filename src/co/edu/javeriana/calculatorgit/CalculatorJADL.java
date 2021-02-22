package co.edu.javeriana.calculatorgit;

/**
 * @author Juan Alejandro Diaz Lote
 */

public class CalculatorJADL implements ICalculator {
	@Override
	  public double add(double x, double y){
	    
	    return x + y;
	  }

	  @Override
	  public double substract (double x, double y){
	    
	    return x - y;
	  }

	  @Override
	  public double multiply (double x, double y){
	    
	    return x * y;
	  }

	  @Override
	  public double divide (double a, double b) throws ArithmeticException{
	    return a/ b;
	  }

	  @Override	
	  public String about(){
	    return "Calculadora implementada por: " + Authors.JADL;
	  }
}