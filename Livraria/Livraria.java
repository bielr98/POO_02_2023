package livraria;
import java.util.ArrayList;


public class Livraria {
    ArrayList<Livros> livros;

    Livraria(){
        this.livros = new ArrayList<Livros>();
    }

    public void adicionarLivro(Livro l) {
        this.livros.add(lv);
    }

    public String listarLivros() {
        String listaLivros = "";

        for (Livro livro : this.livros) {
            folha += "\n" + livro.id + " - " + livro.titulo;
        }
        return folha;
    }
}
