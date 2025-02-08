package model;

public class Medicamento {
    private int id;
    private String nome;
    private String bula;
    private String posologia;
    
    public Medicamento(int id, String nome, String bula, String posologia) {
        this.id = id;
        this.nome = nome;
        this.bula = bula;
        this.posologia = posologia;
    }
    public Medicamento() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getBula() {
        return bula;
    }
    public void setBula(String bula) {
        this.bula = bula;
    }
    public String getPosologia() {
        return posologia;
    }
    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }
    


}
