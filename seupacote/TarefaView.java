package seupacote;

import java.util.List;

public class TarefaView {
    public void imprimirTarefas(List<Tarefa> tarefas) {
        System.out.println("Lista de Tarefas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println("ID: " + tarefa.getId() + ", Descrição: " + tarefa.getDescricao() + ", Concluída: " + tarefa.isConcluida());
        }
    }
}
