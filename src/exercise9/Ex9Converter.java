package exercise9;

/**
 * Class Ex9Converter
 * @author rublan01
 */
public class Ex9Converter {
    
    
  public Double c2f(Double valueFrom) {
      double temp = (valueFrom * 9/5) + 32;
      return temp;
  }

  public Double c2k(Double valueFrom) {
      double temp = (valueFrom + 273.15);
      return temp;
  }

  public Double f2c(Double valueFrom) {
      double temp = (valueFrom - 32) * 5/9;
      return temp;
  }

  public Double f2k(Double valueFrom) {
      double temp = ((valueFrom - 32) * 5/9 + 273.15);
      return temp;
  }

  public Double k2c(Double valueFrom) {
      double temp = (valueFrom - 273.15);
      return temp;
  }

  public Double k2f(Double valueFrom) {
      double temp = ((valueFrom - 273.15) * 9/5 + 32);
      return temp;
  }
}
