package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Minhas Tarefas");
        System.out.println("----------------------");
        ArrayTarefas tarefas = new ArrayTarefas(3);
        Tarefa tarefa1 = new Tarefa("Xablau");
        Tarefa tarefa2 = new Tarefa("bora estudar");
        Tarefa tarefa3 = new Tarefa("bora trabalhar");
        tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        tarefas.exibirTarefas();
    }
}
