package seupacote;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TarefaController tarefaController = new TarefaController();
        TarefaView tarefaView = new TarefaView();

        List<Tarefa> tarefas = tarefaController.listarTarefas();
        tarefaView.imprimirTarefas(tarefas);
    }
}
