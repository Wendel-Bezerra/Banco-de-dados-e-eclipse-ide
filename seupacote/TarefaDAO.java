package seupacote;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {
    public List<Tarefa> listarTarefas() {
        List<Tarefa> tarefas = new ArrayList<>();

        try (Connection conexao = ConexaoBD.conectar();
             PreparedStatement preparedStatement = conexao.prepareStatement("SELECT * FROM lista_tarefas");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(resultSet.getInt("id"));
                tarefa.setDescricao(resultSet.getString("descricao"));
                tarefa.setConcluida(resultSet.getBoolean("concluida"));
                tarefas.add(tarefa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        try (Connection conexao = ConexaoBD.conectar();
             PreparedStatement preparedStatement = conexao.prepareStatement("INSERT INTO lista_tarefas (descricao, concluida) VALUES (?, ?)")) {

            preparedStatement.setString(1, tarefa.getDescricao());
            preparedStatement.setBoolean(2, tarefa.isConcluida());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarTarefa(Tarefa tarefa) {
        try (Connection conexao = ConexaoBD.conectar();
             PreparedStatement preparedStatement = conexao.prepareStatement("UPDATE lista_tarefas SET descricao = ?, concluida = ? WHERE id = ?")) {

            preparedStatement.setString(1, tarefa.getDescricao());
            preparedStatement.setBoolean(2, tarefa.isConcluida());
            preparedStatement.setInt(3, tarefa.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirTarefa(int id) {
        try (Connection conexao = ConexaoBD.conectar();
             PreparedStatement preparedStatement = conexao.prepareStatement("DELETE FROM lista_tarefas WHERE id = ?")) {

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
