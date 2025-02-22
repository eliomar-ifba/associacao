package model;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    
    // repetições do mesmo método chamamos
    // de sobrecarga de métodos, que faz parte do conceito
    // de polimorfismo
    public Pessoa(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa() {
    }

    public Pessoa(String nome){
        this.nome = nome;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

}
