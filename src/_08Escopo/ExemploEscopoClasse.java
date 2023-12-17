package _08Escopo;

public class ExemploEscopoClasse {
    private int variavelInstancia; // Escopo associado à instância
    private static int variavelEstatica; // Escopo associado à classe

    public void exemploMetodo() {
        int variavelMetodo = 42; // Escopo dentro do método
        System.out.println(variavelInstancia);
        System.out.println(variavelEstatica);
        System.out.println(variavelMetodo);
    }
    
    
}
