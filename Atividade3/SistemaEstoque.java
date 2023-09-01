package Atividade3;
import java.util.ArrayList;
import java.util.List;

public class SistemaEstoque {
    //cria Lista para armazenar os itens em estoque
    private List<EstoqueItem> estoque;

//Inicia uma instancia do estoque com NEW
    public SistemaEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        //Cria um item no estoque com New
        EstoqueItem item = new EstoqueItem(nome, quantidade);

        // Adiciona o item à lista de estoque
        estoque.add(item);
        System.out.println(quantidade + " " + nome + " adicionado ao estoque.");
    }

    //Gera um ID para cada item, para facilitar a remocao
    public void mostrarItensParaRemover() {
        System.out.println("Itens disponíveis para remover:");
        for (int i = 0; i < estoque.size(); i++) {
            EstoqueItem item = estoque.get(i);
            System.out.println(i + ". " + item.getNome() + " - Quantidade: " + item.getQuantidade());
        }
    }





    //remover itens do estoque
    public void removerItem(int id, int quantidade) {
        if (id >= 0 && id < estoque.size()) {
            EstoqueItem item = estoque.get(id);
            if (item.getQuantidade() >= quantidade) {
                item.setQuantidade(item.getQuantidade() - quantidade);
                System.out.println(quantidade + " " + item.getNome() + "(s) removido(s) do estoque.");
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        } else {
            System.out.println("ID inválido.");
        }
    }

    public void listarItens() {

        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio, adicione algo.");
        } else {
            System.out.println("Itens em estoque:");
            for (EstoqueItem item : estoque) {
                System.out.println(item.getNome() + ": " + item.getQuantidade());
            }
        }
    }
    
}

