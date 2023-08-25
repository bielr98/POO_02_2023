import java.util.Scanner;

public class Sistema {
    int opcao = 0;
Scanner sc = new Scanner(System.in);

    while(opcao!=4)
    {
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

public static vois executarOpcao(int op){
    switch(op){
        case 1:
        System.out.println("Adicionando livros");
        break;
        case 2:
        System.out.println("Detalhando livros");
        break;
        case 3:
        System.out.println("1 - Adicionar livros");
        break;
    }
}