package br.com.domain;

public class Desenvolvedor extends Funcionario {

    private int horasExtra;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, String matricula, Double salarioBase, int horasExtra, double valorHoraExtra) {
        super(nome, matricula, salarioBase);
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public void registrarHoraExtra (int horasExtra){
        this.horasExtra += horasExtra;
    }

    public void registrarValorHoraExtra (double valorHoraExtra){
        this.valorHoraExtra = valorHoraExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
       return salarioBase + (valorHoraExtra * horasExtra);
    }
}
