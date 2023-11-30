package com.company.heranca;


public class Dev extends Funcionario {

    private String linguagem;

    
    public Dev(String nome, String sobreNome) {
        super(nome, sobreNome);
    }

    
    public String getLinguagem() {
        return linguagem;
    }

    
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    
    /**
     * @return
     */
    @Override
    public String getNomeCargo() {
        return "Devfull-stack";
    }
    public String getNome(){
        return "Carlos sainz";
    }
    public String getSobreNome(){
        return "ocon";
    }

    
    public static void main(String[] args) {
        
        Dev desenvolvedor = new Dev("Nome do Dev", "Sobrenome do Dev");
        desenvolvedor.setLinguagem("Java");  

        
        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Sobrenome: " + desenvolvedor.getSobreNome());
        System.out.println("Cargo: " + desenvolvedor.getNomeCargo());
        System.out.println("Linguagem: " + desenvolvedor.getLinguagem());
    }
}
