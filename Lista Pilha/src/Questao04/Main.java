package Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HistoricoWeb historico = new HistoricoWeb(5); // capacidade máxima: 5

        while (true) {
            System.out.println("\n1 - Visitar nova página");
            System.out.println("2 - Voltar página");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = sc.nextLine();
                    historico.push(new PaginaWeb(url));
                    break;

                case 2:
                    PaginaWeb removida = historico.pop();
                    if (removida != null) {
                        System.out.println("Voltando da página: " + removida.getUrl());
                    }
                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
