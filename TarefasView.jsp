<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Tarefas</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div id="task-form">
        <h2>Adicionar Tarefa</h2>
        <label for="titulo">Título:</label>
        <input type="text" id="titulo">
        <br>
        <label for="descricao">Descrição:</label>
        <textarea id="descricao"></textarea>
        <br>
        <button onclick="adicionarTarefa()">Adicionar Tarefa</button>
    </div>

    <div id="task-list">
        <h2>Lista de Tarefas</h2>
        <ul id="tarefas"></ul>
    </div>

    <script src="scripts.js"></script>
</body>
</html>
