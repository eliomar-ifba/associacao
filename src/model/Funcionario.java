package model;

public class Funcionario extends Pessoa{
    private  String cargo;
    
    public Funcionario(int id, String nome, String cpf, String cargo) {
        super(id, nome, cpf);
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
