package model;

import java.time.LocalDateTime;

public class Consulta {
    private int id;
    private LocalDateTime dataRealizada;
    private LocalDateTime dataAgendamento;
    private String status;
    private double valor;

    private Medico medico;
    private Funcionario recepcionista;
    private Paciente paciente;
    private Receita receita;
    
    public Consulta(int id, LocalDateTime dataRealizada, LocalDateTime dataAgendamento, String status, double valor,
            Medico medico, Funcionario recepcionista, Paciente paciente, Receita receita) {
        this.id = id;
        this.dataRealizada = dataRealizada;
        this.dataAgendamento = dataAgendamento;
        this.status = status;
        this.valor = valor;
        this.medico = medico;
        this.recepcionista = recepcionista;
        this.paciente = paciente;
        this.receita = receita;
    }
    public Consulta() {
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getDataRealizada() {
        return dataRealizada;
    }
    public void setDataRealizada(LocalDateTime dataRealizada) {
        this.dataRealizada = dataRealizada;
    }
    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }
    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Funcionario getRecepcionista() {
        return recepcionista;
    }
    public void setRecepcionista(Funcionario recepcionista) {
        this.recepcionista = recepcionista;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Receita getReceita() {
        return receita;
    }
    public void setReceita(Receita receita) {
        this.receita = receita;
    }

}
