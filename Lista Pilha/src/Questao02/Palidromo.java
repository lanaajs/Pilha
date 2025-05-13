package Questao02;

import java.util.Scanner;
import java.util.Stack;

public class Palidromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        System.out.print("\n\nDigite uma palavra: ");
        String palavraOriginal = sc.nextLine();

        // Remove espaços, pontuações e deixa minúsculo
        String palavraTratada = palavraOriginal.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Empilhar caracteres um a um
        for (int i = 0; i < palavraTratada.length(); i++) {
            pilha.push(String.valueOf(palavraTratada.charAt(i)));
        }

        // Montar string invertida a partir da pilha
        StringBuilder invertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertida.append(pilha.pop());
        }

        // Verifica se é um palíndromo
        if (palavraTratada.equals(invertida.toString())) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        sc.close();
    }
}
