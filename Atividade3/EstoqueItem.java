package Atividade3;

//classe estoque item
public class EstoqueItem {

    //variaveis da classe
    private String nome;
    private int quantidade;

    public EstoqueItem(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

