package exer_10;

import java.util.ArrayList;
import java.util.List;

public class AutenticacaoUsuarios {

    // 🔹 Interface
    interface Autenticavel {
        boolean autenticar(String senha);
    }

    // 🔹 Classe Usuario
    static class Usuario implements Autenticavel {
        private String nome;
        private String senha;

        public Usuario(String nome, String senha) {
            this.nome = nome;
            this.senha = senha;
        }

        @Override
        public boolean autenticar(String senha) {
            return this.senha.equals(senha);
        }

        public String getNome() {
            return nome;
        }
    }

    // 🔹 Classe Administrador
    static class Administrador implements Autenticavel {
        private String nome;
        private String senha;

        public Administrador(String nome, String senha) {
            this.nome = nome;
            this.senha = senha;
        }

        @Override
        public boolean autenticar(String senha) {
            // Aqui poderia ter regras extras, mas por enquanto é igual ao Usuario
            return this.senha.equals(senha);
        }

        public String getNome() {
            return nome;
        }
    }

    // 🔹 Método principal
    public static void main(String[] args) {
        List<Autenticavel> lista = new ArrayList<>();

        lista.add(new Usuario("Jhess", "1234"));
        lista.add(new Usuario("Maria", "abcd"));
        lista.add(new Administrador("Admin", "root"));

        for (Autenticavel a : lista) {
            // Testando autenticação com senha "1234"
            if (a.autenticar("1234")) {
                if (a instanceof Usuario) {
                    System.out.println("Usuário autenticado: " + ((Usuario) a).getNome());
                } else if (a instanceof Administrador) {
                    System.out.println("Administrador autenticado: " + ((Administrador) a).getNome());
                }
            } else {
                System.out.println("Falha na autenticação!");
            }
        }
    }
}