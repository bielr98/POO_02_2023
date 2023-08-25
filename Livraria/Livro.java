package livraria;
import java.util.Scanner;

public class Livro {
    int id;
    String titulo;
    String anoDePublicacao;
    String editora;
    int qtdPaginas;

    Livro(int id, String titulo, String ano, String editora, int qtdPag){
        this.id = id;
        this.titulo = titulo;
        this.anoDePublicacao = ano;
        this.editora = editora;
        this.qtdPaginas = qtdPag;
    }
}

String detalhar(){
    String detalhe = "";
    detalhe += "\nID: " + this.id;
    detalhe += "\nTitulo: " + this.titulo;
    detalhe += "\nAno de Publicacao: " + this.anoDePublicacao;
    detalhe += "\nEditora: " + this.editora;
    detalhe += "\nQtd Paginas: " + this.qtdPaginas;

    return detalhe;
}
