package exer_04;

// Classe base Veiculo
class Veiculo {
  private String marca;
  private String modelo;
  private int ano;

  public Veiculo(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public void imprimirInformacoes() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
  }

  // Getters e setters omitidos para brevidade
}
// Subclasse Carro
class Carro extends Veiculo {
  private int numeroDePortas;

  public Carro(String marca, String modelo, int ano, int numeroDePortas) {
    super(marca, modelo, ano);
    this.numeroDePortas = numeroDePortas;
  }

  @Override
  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Número de portas: " + numeroDePortas);
  }
}

// Subclasse Moto
class Moto extends Veiculo {
  private boolean temPartidaEletrica;

  public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
    super(marca, modelo, ano);
    this.temPartidaEletrica = temPartidaEletrica;
  }

  @Override
  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
  }
}

// Classe de teste
public class ImpressaoInfoVeiculos {
  public static void main(String[] args) {
    Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
    Moto moto = new Moto("Honda", "CG 160", 2022, true);

    System.out.println("Informações do Carro:");
    carro.imprimirInformacoes();

    System.out.println("\nInformações da Moto:");
    moto.imprimirInformacoes();
  }
}