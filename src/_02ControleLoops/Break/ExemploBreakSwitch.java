package _02ControleLoops.Break;

public class ExemploBreakSwitch {
    public static void main(String[] args) {
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada.");
                break;
            case 2:
                System.out.println("Opção 2 selecionada. Saindo do switch.");
                break;
            case 3:
                System.out.println("Opção 3 selecionada.");
                break;
            default:
                System.out.println("Opção padrão.");
        }
    }
}
