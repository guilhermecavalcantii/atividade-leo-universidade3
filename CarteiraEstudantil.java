package com.company;


public class CarteiraEstudantil {

    private String nome;
    private String sobreNome;
    private int idade;
    private boolean ativo;

    public CarteiraEstudantil() {
    }

    public CarteiraEstudantil(String nome, String sobreNome, int idade, boolean ativo) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.ativo = ativo;
    }

    public CarteiraEstudantil(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobreNome);
        System.out.println("Idade: " + idade);
        System.out.println("Ativo: " + ativo);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("Carteira estudantil");

        // Criando instâncias da classe e atribuindo valores
        CarteiraEstudantil estudante1 = new CarteiraEstudantil("João", "Silva", 20, true);
        CarteiraEstudantil estudante2 = new CarteiraEstudantil("Maria", "Oliveira", 22, true);
        CarteiraEstudantil estudante3 = new CarteiraEstudantil("Carlos", "Souza", 19, true);
        CarteiraEstudantil estudante4 = new CarteiraEstudantil("Ana", "Lima", 21, false);

        // Chamando o método mostrarDados() para exibir os detalhes
        estudante1.mostrarDados();
        estudante2.mostrarDados();
        estudante3.mostrarDados();
        estudante4.mostrarDados();
    }
}
