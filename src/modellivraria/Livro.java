package modellivraria;

public class Livro extends Obra{
    private int tiragem;

    public Livro(int id, String titulo, String isbn, double valor, int tiragem) {
        super(id, titulo, isbn, valor);
        this.tiragem = tiragem;
    }

    public Livro() {
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }
}
