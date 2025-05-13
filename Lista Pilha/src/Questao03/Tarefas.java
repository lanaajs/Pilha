package Questao03;

import java.util.Scanner;
import java.util.Stack;

public class Tarefas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        int op;

        do {
            System.out.println("\n\tMENU"
                    + "\n 1) Inserir tarefa na pilha"
                    + "\n 2) Obter a próxima tarefa da pilha"
                    + "\n 3) Sair");

            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = sc.nextLine();
                    pilha.push(tarefa);
                    System.out.println("Tarefa \"" + tarefa + "\" inserida na pilha.");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        String proxima = pilha.pop();
                        System.out.println("Próxima tarefa: " + proxima);
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 3);

        sc.close();
    }
}
