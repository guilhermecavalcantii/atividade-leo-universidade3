package com.company;

public class FuncionarioMain {

    public static void main(String[] args) {
        // Criando objetos Funcionario (Gerente e Analista)
        Funcionario gerente = new Gerente("João", "Silva", "123.456.789-00", 5000.0);
        Funcionario analista = new Analista("Maria", "Oliveira", "987.654.321-00", 3000.0);

        // Exibindo informações dos funcionários
        exibirInformacoesFuncionario(gerente);
        exibirInformacoesFuncionario(analista);
    }

    // Método para exibir informações de um funcionário
    private static void exibirInformacoesFuncionario(Funcionario funcionario) {
        System.out.println("Nome Completo: " + funcionario.getNomeCompleto());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Cargo: " + funcionario.getNomeCargo());
        System.out.println("--------------------");
    }
}

// Classe Funcionario
    abstract class Funcionario{

    private String nome;
    private String sobreNome;
    private String cpf;
    private double salario;

    // Construtor completo
    public Funcionario(String nome, String sobreNome, String cpf, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.salario = salario;
    }

    // Método abstrato que deve ser implementado pelos filhos desta classe
    public abstract String getNomeCargo();

    public String getNomeCompleto() {
        return this.nome + " " + this.sobreNome;
    }

    /*
        GETTER's and SETTER's
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Classe Gerente
class Gerente extends Funcionario {

    public Gerente(String nome, String sobreNome, String cpf, double salario) {
        super(nome, sobreNome, cpf, salario);
    }

    @Override
    public String getNomeCargo() {
        return "Gerente";
    }
}

// Classe Analista
class Analista extends Funcionario {

    public Analista(String nome, String sobreNome, String cpf, double salario) {
        super(nome, sobreNome, cpf, salario);
    }

    @Override
    public String getNomeCargo() {
        return "Analista";
    }
}
