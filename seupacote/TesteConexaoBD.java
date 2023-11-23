package seupacote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoBD {
    public static void main(String[] args) {
        Connection conexao = null;

        try {
            // Configurações de conexão
            String url = "jdbc:postgresql://localhost:5432/tarefas";
            String usuario = "postgres";
            String senha = "008830";

            // Estabelecer a conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } finally {
            // Fechar a conexão
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
    }
}
