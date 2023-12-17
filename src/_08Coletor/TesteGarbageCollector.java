package _08Coletor;

public class TesteGarbageCollector {
    public static void main(String[] args) {
        // Criando objetos
        ObjetoTeste obj1 = new ObjetoTeste("Objeto 1");
        ObjetoTeste obj2 = new ObjetoTeste("Objeto 2");
        ObjetoTeste obj3 = new ObjetoTeste("Objeto 3");

        // Apontando obj1 para null, indicando que não há mais referência a esse objeto
        obj1 = null;

        // Simulando algum processamento sem referenciar obj2 e obj3
        processamentoSemReferencia();

        // Fazendo uma chamada ao Garbage Collector explicitamente (não é necessário em situações normais)
        System.gc();

        // Agora, os objetos que não têm referências devem ser coletados
    }

    private static void processamentoSemReferencia() {
        // Simulação de algum processamento sem referenciar os objetos
        // ...

        // Exemplo: Simular um método que cria objetos temporários sem atribuir a variáveis
        new ObjetoTeste("Temporário 1");
        new ObjetoTeste("Temporário 2");
    }
}

class ObjetoTeste {
    private String nome;

    public ObjetoTeste(String nome) {
        this.nome = nome;
        System.out.println("Objeto criado: " + nome);
    }

    @Override
    protected void finalize() throws Throwable {
        // Método finalize é chamado antes da liberação do objeto pelo Garbage Collector
        System.out.println("Objeto finalizado: " + nome);
    }
}
