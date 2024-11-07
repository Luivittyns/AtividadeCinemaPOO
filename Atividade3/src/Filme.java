import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private Categoria categoria;
    private int duracao;

    public static List<Filme> filmesPadrao = new ArrayList<>();

    public Filme(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.categoria = new Categoria(genero, "Descrição do gênero " + genero);
        this.duracao = duracao;
    }

    static {
        filmesPadrao.add(new Filme("Frozen", "Fantasia", 102));
        filmesPadrao.add(new Filme("Através da Minha Janela", "Romance", 114));
        filmesPadrao.add(new Filme("Carros", "Fantasia", 114));
        filmesPadrao.add(new Filme("O Rei Leão", "Animação", 88));
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getDuracao() {
        return duracao;
    }
}
