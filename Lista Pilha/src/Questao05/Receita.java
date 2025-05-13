package Questao05;

import java.util.Scanner;
import java.util.Stack;

public class Receita {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        int op;

        do {
            System.out.println("\n\tMENU"
                    + "\n 1) Inserir tarefa na pilha"
                    + "\n 2) Remover tarefa da pilha"
                    + "\n 3) Verificar se todas as tarefas foram concluídas"
                    + "\n 4) Sair");

            System.out.print("\nEscolha uma opção: ");
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
                        System.out.println("A pilha está vazia. Nenhuma tarefa para remover.");
                    } else {
                        String proxima = pilha.pop();
                        System.out.println("Tarefa concluída: " + proxima);
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("Todas as tarefas foram concluídas!");
                    } else {
                        System.out.println("Ainda há tarefas pendentes: " + pilha.size());
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (op != 4);

        sc.close();
    }
}
