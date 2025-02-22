package model;

public class Paciente extends Pessoa{
    private String planoSaude;

    public Paciente(int id, String nome, String cpf, String planoSaude) {
        super(id, nome, cpf);
        this.planoSaude = planoSaude;
    }

    public Paciente() {
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }
   
   

    
    
}
