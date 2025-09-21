package exer_03;

public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

  public ContaBancaria(String numeroConta, double saldoInicial) {
      this.numeroConta = numeroConta;
      this.saldo = saldoInicial;
  }

  public String getNumeroConta() {
      return numeroConta;
  }

  public double getSaldo() {
      return saldo;
  }

  public void depositar(double valor) {
      if (valor > 0) {
        saldo += valor;
      }
  }

  public boolean sacar(double valor) {
      if (valor > 0 && saldo >= valor) {
        saldo -= valor;
        return true;
      }
      return false;
  }

  public static void main(String[] args) {
      System.out.println("=== Exercício 03 - Conta Bancária ===");

        ContaCorrente cc = new ContaCorrente("12345-6", 1000, 500);
        ContaPoupanca cp = new ContaPoupanca("98765-4", 2000, 0.05);

        System.out.println("Saldo inicial Conta Corrente: " + cc.getSaldo());
        cc.sacar(1200);
        System.out.println("Saldo após saque Conta Corrente: " + cc.getSaldo());

        System.out.println("Saldo inicial Conta Poupança: " + cp.getSaldo());
        cp.aplicarJuros();
        System.out.println("Saldo após aplicar juros: " + cp.getSaldo());
  }
}

class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldoInicial, double limiteChequeEspecial) {
      super(numeroConta, saldoInicial);
      this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
      if (valor > 0 && saldo + limiteChequeEspecial >= valor) {
        saldo -= valor;
        return true;
      }
      return false;
    }

    public double getLimiteChequeEspecial() {
      return limiteChequeEspecial;
  }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
      this.limiteChequeEspecial = limiteChequeEspecial;
  }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaJuros) {
      super(numeroConta, saldoInicial);
      this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
      saldo += saldo * taxaJuros;
    }

    public double getTaxaJuros() {
      return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
      this.taxaJuros = taxaJuros;
    }
}