package _10TrabalhandoComStrings.JuntandoSeparando;

public class ExemploStringBuilder {
    public static void main(String[] args) {
        // Usando StringBuilder para concatenação eficiente
        StringBuilder builder = new StringBuilder();
        builder.append("Olá, ");
        builder.append("Mundo!");
        String resultado = builder.toString();

        System.out.println("Resultado da concatenação: " + resultado); // Olá, Mundo!
    }
}
