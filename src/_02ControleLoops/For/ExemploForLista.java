package _02ControleLoops.For;

import java.util.ArrayList;
import java.util.List;

public class ExemploForLista {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Pera");

        System.out.println("Iteração usando for:");

        for (int i = 0; i < frutas.size(); i++) {
            String fruta = frutas.get(i);
            System.out.println("Índice " + i + ": " + fruta);
        }
    }
}
