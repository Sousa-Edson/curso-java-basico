package _08Wrappers;

public class ExemploWrappers {
    public static void main(String[] args) {
        // Exemplo com Integer
        int primitivo = 42;
        Integer objeto = Integer.valueOf(primitivo); // Autoboxing

        System.out.println("Valor primitivo: " + primitivo);
        System.out.println("Valor como objeto Integer: " + objeto);

        // Exemplo com Double
        double primitivoDouble = 3.14;
        Double objetoDouble = Double.valueOf(primitivoDouble); // Autoboxing

        System.out.println("Valor primitivo double: " + primitivoDouble);
        System.out.println("Valor como objeto Double: " + objetoDouble);

        // Exemplo com Boolean
        boolean primitivoBoolean = true;
        Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean); // Autoboxing

        System.out.println("Valor primitivo boolean: " + primitivoBoolean);
        System.out.println("Valor como objeto Boolean: " + objetoBoolean);

        // Exemplo com autounboxing
        int valorDesempacotado = objeto; // Autounboxing
        System.out.println("Valor desempacotado: " + valorDesempacotado);
    }
}
