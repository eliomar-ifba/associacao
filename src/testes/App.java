package testes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Consulta;
import model.Especialidade;
import model.Funcionario;
import model.Medicamento;
import model.Medico;
import model.Paciente;
import model.Receita;

public class App {
    
    public static void main(String[] args) throws Exception {
        Medico medico = new Medico();
        medico.setNome("Teosvaldo");
        medico.setId(1);

        Especialidade espe1 = new Especialidade();
        espe1.setId(1);
        espe1.setNome("Cardiologia");

        Especialidade espe2 = new Especialidade();
        espe2.setId(2);
        espe2.setNome("Oftalmologia");

        //preparando a lista das especialidades 
        List<Especialidade> listaEspec = new ArrayList<>();
        listaEspec.add(espe2);
        listaEspec.add(espe1);

        //adicionando a lista ao medico com a variável preparada
        medico.setEspecilidades(listaEspec);
        //outra forma mais rápida, sem precisar criar a variável antes
        // que é utilizando o método asList da classe Arrays
        medico.setEspecilidades(Arrays.asList(espe1, espe2));

        Funcionario fun = new Funcionario();
        fun.setId(10);
        fun.setNome("Márcia");
        fun.setCargo("Recepcionista");

        Paciente paciente = new Paciente(1, "Bia");

        Medicamento medicamento1 = new Medicamento(2, "Diazepan", "se acalma", "3 em 3 horas"); 
        Medicamento medicamento2 = new Medicamento(5, "AS", "Sei não", "12 em 12 horas"); 

        Receita receita = new Receita(1, "nada", Arrays.asList(medicamento1, medicamento2));

        Consulta consulta = new Consulta();
        consulta.setId(1);
        consulta.setDataAgendamento(LocalDateTime.now());
        consulta.setDataRealizada(LocalDateTime.now());
        consulta.setStatus("Agendada");
        consulta.setValor(500);
        consulta.setMedico(medico);
        consulta.setPaciente(paciente);
        consulta.setRecepcionista(fun);
        consulta.setReceita(receita);

        System.out.println("DADOS DA CONSULTA");
        System.out.println("ID: " + consulta.getId());
        System.out.println("Data Agendamento: " + consulta.getDataAgendamento());
        System.out.println("Data Realizada: " + consulta.getDataRealizada());
        System.out.println("Valor: " + consulta.getValor());
        System.out.println("Status: " + consulta.getStatus());
        System.out.println("Médico: " + consulta.getMedico().getNome());
        
        System.out.print("Escialidades: " );
        for(Especialidade e : consulta.getMedico().getEspecilidades()){
            System.out.print(e.getNome() + ", ");
        }
        
        System.out.println("\nPaciente: " + consulta.getPaciente().getNome());
        System.out.println("Recepcionista: " + consulta.getRecepcionista().getNome());
        
        System.out.println("***** Receita *****");
        System.out.println("Descrição:" + consulta.getReceita().getDescricao());
        System.out.println(" #### Medicamentos ####");
        for(Medicamento m : consulta.getReceita().getMedicamentos()){
            System.out.println("Nome: " + m.getNome());
            System.out.println("Posologia: " + m.getPosologia());
        }




        


        System.out.println("Hello, World!");
    }
}
