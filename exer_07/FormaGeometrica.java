package exer_07;

public abstract class FormaGeometrica {
  public abstract double calcularArea();
  public abstract double calcularPerimetro();

  public static void main(String[] args) {
        System.out.println("=== Exercício 07 - Formas Geométricas ===");

        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 4, 5);

        System.out.println("Círculo: Área = " + circulo.calcularArea() +
                           ", Perímetro = " + circulo.calcularPerimetro());

        System.out.println("Retângulo: Área = " + retangulo.calcularArea() +
                           ", Perímetro = " + retangulo.calcularPerimetro());

        System.out.println("Triângulo: Área = " + triangulo.calcularArea() +
                           ", Perímetro = " + triangulo.calcularPerimetro());
    }
}

class Circulo extends FormaGeometrica {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return Math.PI * raio * raio;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
}

class Retangulo extends FormaGeometrica {
  private double largura;
  private double altura;

  public Retangulo(double largura, double altura) {
    this.largura = largura;
    this.altura = altura;
  }

  @Override
  public double calcularArea() {
    return largura * altura;
  }

  @Override
  public double calcularPerimetro() {
    return 2 * (largura + altura);
  }
}

class Triangulo extends FormaGeometrica {
  private double ladoA;
  private double ladoB;
  private double ladoC;

  public Triangulo(double ladoA, double ladoB, double ladoC) {
    this.ladoA = ladoA;
    this.ladoB = ladoB;
    this.ladoC = ladoC;
  }

  @Override
  public double calcularArea() {
    double s = (ladoA + ladoB + ladoC) / 2;
    return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
  }

  @Override
  public double calcularPerimetro() {
    return ladoA + ladoB + ladoC;
  }
}