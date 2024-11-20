import services.TarefaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarefaService tarefaService = new TarefaService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Organizador de Tarefas ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Atualizar Status de Tarefa");
            System.out.println("4. Remover Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Status (Pendente/Concluída): ");
                    String status = scanner.nextLine();
                    tarefaService.adicionarTarefa(titulo, descricao, status);
                    break;

                case 2:
                    System.out.println("\n=== Lista de Tarefas ===");
                    tarefaService.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o índice da tarefa a atualizar: ");
                    int indiceAtualizar = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    System.out.print("Novo status (Pendente/Concluída): ");
                    String novoStatus = scanner.nextLine();
                    tarefaService.atualizarTarefa(indiceAtualizar, novoStatus);
                    break;

                case 4:
                    System.out.print("Digite o índice da tarefa a remover: ");
                    int indiceRemover = scanner.nextInt() - 1;
                    tarefaService.removerTarefa(indiceRemover);
                    break;

                case 5:
                    System.out.println("Saindo... Até mais!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}