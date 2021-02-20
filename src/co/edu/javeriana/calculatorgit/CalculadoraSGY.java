package co.edu.javeriana.calculatorgit;

/**
 * @author Diana Garcia
 */

public class CalculadoraSGY implements ICalculator{

  @Override
  public double add(double a, double b){
    
    return a + b;
  }

  @Override
  public double substract (double a, double b){
    
    return a - b;
  }

  @Override
  public double multiply (double a, double b){
    
    return a * b;
  }

  @Override
  public double divide (double a, double b) throws ArithmeticException{
    return a / b;
  }

  @Override	
  public String about(){
    return "Calculator implemented by " + Authors.SGY;
  }
}

