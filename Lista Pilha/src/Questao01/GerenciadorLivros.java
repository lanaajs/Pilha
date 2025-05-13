package Questao01;

import java.util.Scanner;
import java.util.Stack;

public class GerenciadorLivros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        String op;

        do {
            System.out.println("\n\tMENU"
                    + "\n a) Inserir na Pilha"
                    + "\n b) Consultar na Pilha"
                    + "\n c) Remover na Pilha"
                    + "\n d) Esvaziar a Pilha"
                    + "\n e) Sair");

            System.out.print("Escolha uma opção: ");
            op = scanner.nextLine();

            switch (op.toLowerCase()) {
                case "a":
                    System.out.print("Digite o nome do livro para inserir: ");
                    String livro = scanner.nextLine();
                    pilha.push(livro);
                    System.out.println("Livro \"" + livro + "\" inserido na pilha.");
                    break;

                case "b":
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha: " + pilha);
                    }
                    break;

                case "c":
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia. Nada a remover.");
                    } else {
                        String removido = pilha.pop();
                        System.out.println("Livro removido: " + removido);
                    }
                    break;

                case "d":
                    pilha.clear();
                    System.out.println("A pilha foi esvaziada.");
                    break;

                case "e":
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!op.equalsIgnoreCase("e"));

        scanner.close();
    }
}
