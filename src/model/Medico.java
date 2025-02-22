package model;

import java.util.List;

public class Medico extends Pessoa{
    private String crm;
    private List<Especialidade> especilidades;
    
    public Medico(int id, String nome, String cpf, String crm, List<Especialidade> especilidades) {
        super(id, nome, cpf);
        this.crm = crm;
        this.especilidades = especilidades;
    }

    public Medico() {
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public List<Especialidade> getEspecilidades() {
        return especilidades;
    }

    public void setEspecilidades(List<Especialidade> especilidades) {
        this.especilidades = especilidades;
    }
    
}
