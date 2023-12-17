package _08Anotacoes;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MinhaAnotacao {
    String valor() default "Padrão";
}

public class Exemplo {
    @MinhaAnotacao1(valor = "Personalizado")
    public void meuMetodo() {
        // Implementação do método
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        try {
            Method metodo = exemplo.getClass().getMethod("meuMetodo");

            // Verificando se a anotação está presente no método
            if (metodo.isAnnotationPresent(MinhaAnotacao1.class)) {
                MinhaAnotacao1 anotacao = metodo.getAnnotation(MinhaAnotacao1.class);
                System.out.println("Valor da Anotação: " + anotacao.valor());
            } else {
                System.out.println("A anotação não está presente no método.");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
