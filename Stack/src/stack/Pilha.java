package stack;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<>();

		// verificar se a pilha está vazia
		if (pilha.isEmpty()) { // isEmpty da classe Vector
			System.out.println("Pilha está vazia");
		}else {
			System.out.println("Pilha possui dados");
		}

		// empilhando = push
		pilha.push("Alana");
		pilha.push("Kayke");
		pilha.push("Ryan");
		pilha.push("Beltrano");
		pilha.push("Fulano"); //push da classe Stack
		pilha.add("Fulaninho"); //add da classe Vector
		pilha.addElement("Ciclano"); //add da classe Vector

		// verificar se a pilha está vazia
		if (pilha.empty()) { // empty da classe Stack
			System.out.println("Pilha está vazia");
		}else {
			System.out.println("Pilha possui dados");
		}
		
		//elementos da pilha
		System.out.println("Elementos na pilha: " + pilha);

		// visualizar topo da pilha = peek
		System.out.println("Topo da pilha: " + pilha.peek());

		// desempilhando = pop
		System.out.println("Removendo topo da pilha... ");
		pilha.pop();
		System.out.println("Removendo topo da pilha... ");
		pilha.remove(pilha.peek());  //remove da classe Vector
		
		System.out.println("Topo da pilha atualizado: " + pilha.peek());
		
		//elementos da pilha
		System.out.println("Elementos na pilha: " + pilha);
		
		//tamanho da pilha = size
		System.out.println("Tamanho da pilha: " + pilha.size()); //size da classe Vector
	}

}
