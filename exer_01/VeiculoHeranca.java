package exer_01;

// Classe base Veiculo
class Veiculo {
  private String modelo;
  private int ano;

  public Veiculo(String modelo, int ano) {
    this.modelo = modelo;
    this.ano = ano;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAno() {
    return ano;
  }

  public void exibirInfo() {
    System.out.println("Modelo: " + modelo + ", Ano: " + ano);
  }
}

// Subclasse Carro
class Carro extends Veiculo {
  private int numeroPortas;
  private boolean temArCondicionado;

  public Carro(String modelo, int ano, int numeroPortas, boolean temArCondicionado) {
    super(modelo, ano);
    this.numeroPortas = numeroPortas;
    this.temArCondicionado = temArCondicionado;
  }

  public void ligarArCondicionado() {
    if (temArCondicionado) {
      System.out.println("Ar-condicionado ligado.");
    } else {
      System.out.println("Este carro não possui ar-condicionado.");
    }
  }

  @Override
  public void exibirInfo() {
    super.exibirInfo();
    System.out.println("Portas: " + numeroPortas + ", Ar-condicionado: " + (temArCondicionado ? "Sim" : "Não"));
  }
}

// Subclasse Moto
class Moto extends Veiculo {
  private int cilindradas;
  private boolean temPartidaEletrica;

  public Moto(String modelo, int ano, int cilindradas, boolean temPartidaEletrica) {
    super(modelo, ano);
    this.cilindradas = cilindradas;
    this.temPartidaEletrica = temPartidaEletrica;
  }

  public void empinar() {
    System.out.println("A moto está empinando!");
  }

  @Override
  public void exibirInfo() {
    super.exibirInfo();
    System.out.println("Cilindradas: " + cilindradas + ", Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
  }
}

// Classe de teste
public class VeiculoHeranca {
  public static void main(String[] args) {
    Carro carro = new Carro("Sedan X", 2022, 4, true);
    Moto moto = new Moto("Moto Y", 2021, 250, false);

    System.out.println("Informações do Carro:");
    carro.exibirInfo();
    carro.ligarArCondicionado();

    System.out.println("\nInformações da Moto:");
    moto.exibirInfo();
    moto.empinar();
  }
}