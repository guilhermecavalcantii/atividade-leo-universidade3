package com.company.heranca;

interface Autenticavel {
    boolean autentica(int senha);
}

class Funcionario implements Autenticavel {
    private String nome;

    public Funcionario(String nome2, String sobreNome) {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean autentica(int senha) {
        return senha == 123;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class SistemaInterno {
    public boolean autentica(Autenticavel func, int senha) {
        if (func.autentica(senha)) {
            System.out.println("Usuário logado: " + ((Funcionario) func).getNome());
            return true;
        } else {
            System.out.println("Usuário não logado, problema na autenticação");
            return false;
        }
    }

    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();

        Funcionario funcionario = new Funcionario(null);
        funcionario.setNome("Donatello juíz");

        
        sistema.autentica(funcionario, 123);

        
        sistema.autentica(funcionario, 456);
    }
}
