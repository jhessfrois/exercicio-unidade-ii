package exer_08;

import java.util.ArrayList;
import java.util.List;

// Classe base Animal
abstract class Animal {
  public abstract void emitirSom();
}

// Subclasses de exemplo
class Cachorro extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("Cachorro: Au Au!");
  }
}

class Gato extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("Gato: Miau!");
  }
}

class Vaca extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("Vaca: Muu!");
  }
}

class Pato extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("Pato: Quack!");
  }
}

public class ListaSonsAnimais {
  public static void main(String[] args) {
    List<Animal> animais = new ArrayList<>();
    animais.add(new Cachorro());
    animais.add(new Gato());
    animais.add(new Vaca());
    animais.add(new Pato());

    System.out.println("Sinfonia dos animais:");
    for (Animal animal : animais) {
      animal.emitirSom();
    }
  }
}