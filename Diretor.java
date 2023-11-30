package com.company.heranca;


public class Diretor extends Funcionario {

    private int senha;

    public Diretor(String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    public String getNomeCargo() {
        return "";
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getNome() {
        return "barão de lucena";
    }

    public String getSobreNome() {
        return "pierre raboni";
    }

    public static void main(String[] args) {
        // Preenchendo as informações do Diretor
        Diretor diretor = new Diretor("barão de lucena", "pierre raboni");
        diretor.setSenha(123456);

        // Exemplo de autenticação
        diretor.autentica(123456);

        // Exibindo informações do Diretor
        System.out.println("Nome:" + diretor.getNome());
        System.out.println("Sobrenome:" + diretor.getSobreNome());
        System.out.println("Cargo:Executivo " + diretor.getNomeCargo());
        System.out.println("Senha: " + diretor.getSenha());
    }
}
