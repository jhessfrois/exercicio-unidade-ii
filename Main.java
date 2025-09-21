import java.util.Scanner;

import exer_01.VeiculoHeranca;
import exer_02.HierarquiaAnimais;
import exer_03.ContaBancaria;
import exer_04.ImpressaoInfoVeiculos;
import exer_05.SonsAnimais;
import exer_06.PolimorfismoCalculadora;
import exer_07.FormaGeometrica;
import exer_08.ListaSonsAnimais;
import exer_09.AplicacaoJuros;
import exer_10.AutenticacaoUsuarios;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== MENU PRINCIPAL DE EXERCÍCIOS ===");
            System.out.println("1. Veículo e Herança");
            System.out.println("2. Hierarquia de Animais");
            System.out.println("3. Conta Bancária");
            System.out.println("4. Impressão de Informações de Veículos");
            System.out.println("5. Sons dos Animais");
            System.out.println("6. Polimorfismo na Calculadora");
            System.out.println("7. Formas Geométricas e Cálculo de Áreas");
            System.out.println("8. Lista de Sons de Animais");
            System.out.println("9. Aplicação de Juros em Contas Bancárias");
            System.out.println("10.  Autenticação de Usuários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    VeiculoHeranca.main(new String[]{});
                    break;
                case 2:
                    HierarquiaAnimais.main(new String[]{});
                    break;
                case 3:
                    ContaBancaria.main(new String[]{});
                    break;
                case 4:
                    ImpressaoInfoVeiculos.main(new String[]{});
                    break;
                case 5:
                    SonsAnimais.main(new String[]{});
                    break;
                case 6:
                    PolimorfismoCalculadora.main(new String[]{});
                    break;
                case 7:
                    FormaGeometrica.main(new String[]{});
                    break;
                case 8:
                    ListaSonsAnimais.main(new String[]{});
                    break;
                case 9:
                    AplicacaoJuros.main(new String[]{});
                    break;
                case 10:
                    AutenticacaoUsuarios.main(new String[]{});
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
