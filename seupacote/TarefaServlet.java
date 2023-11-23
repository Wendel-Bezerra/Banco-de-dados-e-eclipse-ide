package seupacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/tarefas")
public class TarefaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        TarefaController tarefaController = new TarefaController();
        List<Tarefa> tarefas = tarefaController.listarTarefas();

        
        request.setAttribute("tarefas", tarefas);

  
        request.getRequestDispatcher("/WEB-INF/jsp/tarefas.jsp").forward(request, response);
    }
}
