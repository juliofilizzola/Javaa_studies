package br.com;

import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Minhas Tarefas");
        System.out.println("----------------------");
        Tarefa tarefa1 = new Tarefa("Regar as Plantas");
        tarefa1.exibirTtarefa();
        System.out.println("A tarefa tem " + tarefa1.obterTamanhotarefa() + " caracterers");
    }
}
