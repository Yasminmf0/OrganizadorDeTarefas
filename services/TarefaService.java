package services;

import models.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String titulo, String descricao, String status) {
        Tarefa tarefa = new Tarefa(titulo, descricao, status);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void atualizarTarefa(int indice, String novoStatus) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice);
            tarefa.setStatus(novoStatus);
            System.out.println("Status da tarefa atualizado para: " + novoStatus);
        } else {
            System.out.println("Índice inválido. Tarefa não encontrada.");
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Índice inválido. Tarefa não encontrada.");
        }
    }
}