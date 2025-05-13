package Questao04;

public class HistoricoWeb {

    private PaginaWeb[] pilha;
    private int topo;
    private int capacidade;

    //inicia
    public HistoricoWeb(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new PaginaWeb[capacidade];
        this.topo = -1; // Pilha vazia
    }

    //add
    public boolean push(PaginaWeb pagina) {
        if (topo >= capacidade - 1) {
            System.out.println("Pilha cheia! Não é possível adicionar: " + pagina.getUrl());
            return false;
        }
        pilha[++topo] = pagina;
        return true;
    }

    //remove
    public PaginaWeb pop() {
        if (topo == -1) {
            System.out.println("Pilha vazia! Nada para remover.");
            return null;
        }
        return pilha[topo--];
    }
}
