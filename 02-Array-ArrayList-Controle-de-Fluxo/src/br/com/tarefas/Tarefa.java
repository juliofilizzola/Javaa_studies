package br.com.tarefas;

public class Tarefa {
    String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void exibirTtarefa() {
        System.out.println(descricao);
    }

    public int obterTamanhotarefa() {
        return descricao.length();
    }
}
