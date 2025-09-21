package exer_02;

public class HierarquiaAnimais {
  public static void main(String[] args) {
    Mamifero leao = new Mamifero("Leão", 5, "Pelos", true);
    Ave papagaio = new Ave("Papagaio", 2, true, true);
    Peixe tubarao = new Peixe("Tubarão", 8, "Cartilaginosa", false);

    leao.exibirInfo();
    papagaio.exibirInfo();
    tubarao.exibirInfo();
  }
}

// Classe base
class Animal {
  protected String nome;
  protected int idade;

  public Animal(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void exibirInfo() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade + " anos");
  }
}

// Subclasse Mamífero
class Mamifero extends Animal {
  private String tipoPelagem;
  private boolean amamenta;

  public Mamifero(String nome, int idade, String tipoPelagem, boolean amamenta) {
    super(nome, idade);
    this.tipoPelagem = tipoPelagem;
    this.amamenta = amamenta;
  }

  @Override
  public void exibirInfo() {
    super.exibirInfo();
    System.out.println("Tipo de pelagem: " + tipoPelagem);
    System.out.println("Amamenta: " + (amamenta ? "Sim" : "Não"));
    System.out.println();
  }
}

// Subclasse Ave
class Ave extends Animal {
  private boolean voa;
  private boolean temPenasColoridas;

  public Ave(String nome, int idade, boolean voa, boolean temPenasColoridas) {
    super(nome, idade);
    this.voa = voa;
    this.temPenasColoridas = temPenasColoridas;
  }

  @Override
  public void exibirInfo() {
    super.exibirInfo();
    System.out.println("Voa: " + (voa ? "Sim" : "Não"));
    System.out.println("Penas coloridas: " + (temPenasColoridas ? "Sim" : "Não"));
    System.out.println();
  }
}

// Subclasse Peixe
class Peixe extends Animal {
  private String tipoEscama;
  private boolean aguaDoce;

  public Peixe(String nome, int idade, String tipoEscama, boolean aguaDoce) {
    super(nome, idade);
    this.tipoEscama = tipoEscama;
    this.aguaDoce = aguaDoce;
  }

  @Override
  public void exibirInfo() {
    super.exibirInfo();
    System.out.println("Tipo de escama: " + tipoEscama);
    System.out.println("Vive em água doce: " + (aguaDoce ? "Sim" : "Não"));
    System.out.println();
  }
}