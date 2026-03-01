package br.com.domain;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public Funcionario(String nome, String matricula, Double salarioBase){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    //Metodo abstrato deve ser implementado pelas subclasses.
    public abstract double calcularSalario();

    //Metodo abstrato deve ser implementado pelas subclasses.
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salario Base: " + this.salarioBase);
        System.out.println("Salario Liquido: " + this.calcularSalario());
    }
}
