package model;

import java.util.List;

public class Medico {
    private int id;
    private String nome;
    private List<Especialidade> especilidades;
    
    public Medico() {
    }
    public Medico(int id, String nome, List<Especialidade> especilidades) {
        this.id = id;
        this.nome = nome;
        this.especilidades = especilidades;
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
    public List<Especialidade> getEspecilidades() {
        return especilidades;
    }
    public void setEspecilidades(List<Especialidade> especilidades) {
        this.especilidades = especilidades;
    }
}
