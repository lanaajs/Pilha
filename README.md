# Estrutura de Dados: Pilha em Java

Este repositório contém uma implementação da estrutura de dados **Pilha (Stack)** em Java, seguindo o princípio **LIFO** (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido.

## 🚀 Funcionalidades

- Inserir elemento na pilha (`push`)
- Remover elemento do topo da pilha (`pop`)
- Visualizar o elemento do topo (`peek`)
- Verificar se a pilha está vazia
- Obter o tamanho da pilha

## 🧠 Conceitos Utilizados

- Estrutura de dados linear
- Encapsulamento com classes
- Manipulação de arrays ou listas
- Controle de fluxo com exceções


## 📌 Exemplo de Uso

```java
Stack pilha = new Stack(5);

pilha.push(10);
pilha.push(20);
pilha.push(30);

System.out.println("Topo: " + pilha.peek()); // 30

pilha.pop();

System.out.println("Novo topo: " + pilha.peek()); // 20
System.out.println("Está vazia? " + pilha.isEmpty()); // false


