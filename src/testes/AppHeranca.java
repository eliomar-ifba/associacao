package testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.Funcionario;
import model.Medico;
import model.Paciente;
import model.Pessoa;

public class AppHeranca {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.setCpf("222222");
        paciente.setNome("John Doe");
        paciente.setPlanoSaude("HapVida");

        System.out.println("Nome: " + paciente.getNome());

        // Exemplo clássico de polimorfismo entre classe filha e mãe
        Pessoa p = new Paciente();
        Pessoa p2 = new Medico();
        Pessoa p3 = new Funcionario();

        //Exemplo de classe abstrata onde não é possível instanciar
        //Pessoa p4 = new Pessoa();


    }


   
  
}
