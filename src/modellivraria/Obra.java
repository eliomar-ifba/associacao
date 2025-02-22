package modellivraria;

public class Obra {
    private int id;
    private String titulo;
    private String isbn;
    private double valor;

    public void aplicarDesconto(double porcertagem){
        
        double desconto = this.valor * porcertagem;
        this.valor = this.valor - desconto;
    }

    public Obra(int id, String titulo, String isbn, double valor) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.valor = valor;
    }
    public Obra() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
