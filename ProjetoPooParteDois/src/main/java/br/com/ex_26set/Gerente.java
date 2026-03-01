package br.com.domain;

public class Gerente extends Funcionario {
    private double comissao;
    private double bonusPerformance;

    public Gerente(String nome, String matricula, Double salarioBase) {
        super(nome, matricula, salarioBase);
        this.comissao = 0.0;
        this.bonusPerformance = 0.0;
    }

    public double getBonusPerformance (){
        return this.bonusPerformance;
    }

    public void setBonusPerformance (double bonusPerformance){
        this.bonusPerformance = bonusPerformance;
    }

    public double getComissao (){
        return this.comissao;
    }

    public void setComissao (double comissao){
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusPerformance * comissao;
    }

}
