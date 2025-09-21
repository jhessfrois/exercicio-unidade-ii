package exer_05;

public class SonsAnimais {
  public static void main(String[] args) {
    Animal cachorro = new Cachorro();
    Animal gato = new Gato();
    Animal vaca = new Vaca();

    cachorro.emitirSom();
    gato.emitirSom();
    vaca.emitirSom();
  }
}

class Animal {
  public void emitirSom() {
    System.out.println("O animal emite um som.");
  }
}

class Cachorro extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("O cachorro late: Au Au!");
  }
}

class Gato extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("O gato mia: Miau!");
  }
}

class Vaca extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("A vaca muge: Muu!");
  }
}