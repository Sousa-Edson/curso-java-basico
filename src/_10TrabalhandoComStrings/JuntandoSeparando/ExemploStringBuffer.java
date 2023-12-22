package _10TrabalhandoComStrings.JuntandoSeparando;

public class ExemploStringBuffer {
    public static void main(String[] args) {
        // Usando StringBuffer para concatenação eficiente
        StringBuffer buffer = new StringBuffer();
        buffer.append("Java ");
        buffer.append("é ");
        buffer.append("poderoso.");
        String resultado = buffer.toString();

        System.out.println("Resultado da concatenação: " + resultado); // Java é poderoso.
    }
}
