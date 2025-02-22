package modellivraria;

public class Ebook extends Obra{
    private String urlMarcaDagua;
    
    public Ebook(int id, String titulo, String isbn, double valor, String urlMarcaDagua) {
        super(id, titulo, isbn, valor);
        this.urlMarcaDagua = urlMarcaDagua;
    }
    public Ebook() {
    }

    public String getUrlMarcaDagua() {
        return urlMarcaDagua;
    }

    public void setUrlMarcaDagua(String urlMarcaDagua) {
        this.urlMarcaDagua = urlMarcaDagua;
    }



}
