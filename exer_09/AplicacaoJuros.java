package exer_09;

public class AplicacaoJuros {
  public static void main(String[] args) {
    ContaBancaria cc = new ContaCorrente("1234", "João", 1000.0);
    ContaBancaria cp = new ContaPoupanca("5678", "Maria", 1000.0);

    cc.aplicarJuros();
    cp.aplicarJuros();

    System.out.println("Saldo Conta Corrente após juros: " + cc.getSaldo());
    System.out.println("Saldo Conta Poupança após juros: " + cp.getSaldo());
  }
}

abstract class ContaBancaria {
  private String numero;
  private String titular;
  protected double saldo;

  public ContaBancaria(String numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public abstract void aplicarJuros();
}

class ContaCorrente extends ContaBancaria {
  public ContaCorrente(String numero, String titular, double saldo) {
    super(numero, titular, saldo);
  }

  @Override
  public void aplicarJuros() {
    saldo += saldo * 0.15; // 15% de juros
  }
}

class ContaPoupanca extends ContaBancaria {
  public ContaPoupanca(String numero, String titular, double saldo) {
    super(numero, titular, saldo);
  }

  @Override
  public void aplicarJuros() {
    saldo += saldo * 0.065; // 6,5% de juros
  }
}