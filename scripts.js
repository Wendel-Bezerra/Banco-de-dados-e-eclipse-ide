function adicionarTarefa() {
    var titulo = document.getElementById('titulo').value;
    var descricao = document.getElementById('descricao').value;

    var tarefa = { titulo: titulo, descricao: descricao };

    // Fazer uma requisição AJAX para o servidor (usando JSP/servlets) para adicionar a tarefa no backend.
    // Aqui, estamos usando o método fetch para simplificar.
    fetch('AdicionarTarefaServlet', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(tarefa),
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            adicionarTarefaNaLista(tarefa);
            limparCampos();
        } else {
            alert('Erro ao adicionar tarefa.');
        }
    })
    .catch((error) => {
        console.error('Erro:', error);
    });
}

function adicionarTarefaNaLista(tarefa) {
    var ul = document.getElementById('tarefas');
    var li = document.createElement('li');
    li.appendChild(document.createTextNode(tarefa.titulo + ': ' + tarefa.descricao));
    ul.appendChild(li);
}

function limparCampos() {
    document.getElementById('titulo').value = '';
    document.getElementById('descricao').value = '';
}
