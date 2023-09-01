package Atividade3;

import java.util.Scanner;

//Classe main é a que roda o codigo de teste
// public class Main {
//     public static void main(String[] args) {

//         // Cria uma instância do SistemaEstoque
//         SistemaEstoque sistemaEstoque = new SistemaEstoque();

//         // Adiciona itens ao estoque
//         sistemaEstoque.adicionarItem("Produto A", 10);
//         sistemaEstoque.adicionarItem("Produto B", 15);

//         //lista os itens totais do estoque
//         sistemaEstoque.listarItens();

//         //remove algum
//         sistemaEstoque.removerItem("Produto A", 5);

//         sistemaEstoque.listarItens();
//     }
// }

public class Main {
    public static void main(String[] args) {
        SistemaEstoque sistemaEstoque = new SistemaEstoque();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar itens");
            System.out.println("4. Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    scanner.nextLine(); // Consumir a quebra de linha após o nextInt()
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    sistemaEstoque.adicionarItem(nome, quantidade);
                    break;
                case 2:
                    sistemaEstoque.mostrarItensParaRemover(); // Mostra os itens disponíveis para remover com ID
                    System.out.print("Escolha o ID do item a ser removido: ");
                    int idRemover = scanner.nextInt();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeRemover = scanner.nextInt();
                    sistemaEstoque.removerItem(idRemover, quantidadeRemover);
                    break;
                case 3:
                    sistemaEstoque.listarItens();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (escolha != 4);

        scanner.close();
    }
}
