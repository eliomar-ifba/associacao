package model;

import java.util.List;

public class Receita {
    private int id;
    private String descricao;
    private List<Medicamento> medicamentos;
    
    public Receita(int id, String descricao, List<Medicamento> medicamentos) {
        this.id = id;
        this.descricao = descricao;
        this.medicamentos = medicamentos;
    }
    public Receita() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}
