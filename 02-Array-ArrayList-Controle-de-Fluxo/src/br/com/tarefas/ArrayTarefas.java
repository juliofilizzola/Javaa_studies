package br.com.tarefas;

public class ArrayTarefas {

    Tarefa[] tarefas;

    public ArrayTarefas(int tamanho) {
        tarefas = new Tarefa[tamanho];
    }

    public void adcionar (Tarefa tarefa) {
        tarefas[0] = tarefa;
    }

    public void removerTarefa(int posicao) {
        tarefas[posicao] = null;
    }

}
