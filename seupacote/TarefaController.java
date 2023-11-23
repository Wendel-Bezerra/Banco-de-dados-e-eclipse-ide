package seupacote;

import java.util.List;

public class TarefaController {
    private TarefaDAO tarefaDAO;

    public TarefaController() {
        this.tarefaDAO = new TarefaDAO();
    }

    public List<Tarefa> listarTarefas() {
        return tarefaDAO.listarTarefas();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefaDAO.adicionarTarefa(tarefa);
    }

    public void atualizarTarefa(Tarefa tarefa) {
        tarefaDAO.atualizarTarefa(tarefa);
    }

    public void excluirTarefa(int id) {
        tarefaDAO.excluirTarefa(id);
    }
}

