package br.com.domain;

public class Estagiario extends Funcionario {

    private int horasTrabalhadas;
    private double valorHorasTrabalhadas;

    public Estagiario(String nome, String matricula, double valorHorasTrabalhadas) {
        super(nome, matricula, 0.0);
        this.horasTrabalhadas = 0;
        this.valorHorasTrabalhadas = valorHorasTrabalhadas;
    }

    public void registrarHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHorasTrabalhadas;
    }
}
