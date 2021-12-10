package br.com;


import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Minhas Tarefas");
        System.out.println("----------------------");

        ListaTarefas tarefas = new ListaTarefas();

        Tarefa tarefa1 = new Tarefa("Xablau");
        Tarefa tarefa2 = new Tarefa("bora estudar");
        Tarefa tarefa3 = new Tarefa("bora trabalhar");
        Tarefa tarefa4 = new Tarefa("bora trabalhar VAMOS");

        tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        tarefas.adicionar(tarefa4);

        tarefas.exibirTarefas();
    }
}
