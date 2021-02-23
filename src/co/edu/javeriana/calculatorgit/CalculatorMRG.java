package co.edu.javeriana.calculatorgit;

/**
 * @author Mariana Rojas Galavís
 */
public class CalculatorMRG implements ICalculator{
  @Override
  public double add(double a, double b){
    return a+b;
  }

  @Override
  public double substract (double a, double b){
    return a-b;
  }

  @Override
  public double multiply (double a, double b){
    return a*b;
  }

  @Override
  public double divide (double a, double b) throws ArithmeticException  {
    return a/b;
  }

  @Override
  public String about(){
    return "Calculadora de " + Authors.MRG;
  }

}