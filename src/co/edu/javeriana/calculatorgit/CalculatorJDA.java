package co.edu.javeriana.calculatorgit;

/**
 * @author Juan David Ardila Paniagua
 */

public class CalculatorJDA implements ICalculator {
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
	  public double divide (double x, double y) throws ArithmeticException{
	    return x / y;
	  }

	  @Override	
	  public String about(){
	    return "Calculator implemented by " + Authors.JDA;
	  }
}