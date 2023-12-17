package _07Enumeradores;

 
//Enumeração com método abstrato
enum Status2 {
 PENDENTE {
     @Override
     public String getDescricao() {
         return "Esta tarefa está pendente.";
     }
 },
 EM_ANDAMENTO {
     @Override
     public String getDescricao() {
         return "Esta tarefa está em andamento.";
     }
 },
 CONCLUIDO {
     @Override
     public String getDescricao() {
         return "Esta tarefa foi concluída.";
     }
 };

 // Método abstrato a ser implementado por cada constante enum
 public abstract String getDescricao();
}

