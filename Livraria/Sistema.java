package livraria;

import java.util.Scanner;


public class Sistema {

    public static void main(String[] args) {

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        Livraria livraria = new Livraria();

        while (opcao != 4) {
            System.out.println("1 - Adicionar livros");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Detalhar livros");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            executarOpcao(opcao);
        }
        System.out.println("Sistema Encerrado");
        sc.close();
    }

}

public static void executarOpcao(int op, Scanner sc, Livraria livraria){
    switch(op){
        case 1:
        System.out.println("Adicionando livros");
        System.out.println("Digite o ID");
        int id = sc.nextInt();

        System.out.println("Digite o Titulo");
        String tit = sc.nextInt();

        System.out.println("Digite Ano de Publicacao");
        String ano = sc.nextInt();

        System.out.println("Digite a Editora");
        String ed = sc.nextInt();

        System.out.println("Digite a qtd de paginas");
        int qtdPg = sc.nextInt();

        Livro l = new Livro(id, tit, ano, ed, qtdPg);
        livraria.adicionarLivro(1);

        break;

        case 2:
        System.out.println("Listando livros");
        System.out.println(livraria.listarLivros());
        break;

        case 3:
        System.out.println("Detalhando livros");
        break;

        case 4:
        System.out.println("Saindo");
        break;
    }
}