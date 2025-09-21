package exer_06;

public class PolimorfismoCalculadora {

  // Soma
  public int soma(int a, int b) {
    return a + b;
  }

  public double soma(double a, double b) {
    return a + b;
  }

  // Subtração
  public int subtrai(int a, int b) {
    return a - b;
  }

  public double subtrai(double a, double b) {
    return a - b;
  }

  // Multiplicação
  public int multiplica(int a, int b) {
    return a * b;
  }

  public double multiplica(double a, double b) {
    return a * b;
  }

  // Divisão
  public int divide(int a, int b) {
    if (b == 0) throw new ArithmeticException("Divisão por zero!");
    return a / b;
  }

  public double divide(double a, double b) {
    if (b == 0.0) throw new ArithmeticException("Divisão por zero!");
    return a / b;
  }

  // Exemplo de uso
  public static void main(String[] args) {
    PolimorfismoCalculadora calc = new PolimorfismoCalculadora();

    System.out.println("Soma int: " + calc.soma(2, 3));
    System.out.println("Soma double: " + calc.soma(2.5, 3.7));

    System.out.println("Subtrai int: " + calc.subtrai(10, 4));
    System.out.println("Subtrai double: " + calc.subtrai(10.5, 4.2));

    System.out.println("Multiplica int: " + calc.multiplica(3, 7));
    System.out.println("Multiplica double: " + calc.multiplica(3.5, 7.2));

    System.out.println("Divide int: " + calc.divide(20, 4));
    System.out.println("Divide double: " + calc.divide(20.0, 4.0));
  }
}