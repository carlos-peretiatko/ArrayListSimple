import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
    //Crie um gerenciador de tarefas
    //Faça métodos para:
    //Adicionar tarefas, caso a tarefa já exista, não insira
    //Remover tarefas.
    //Exibir quantas tarefas ainda restam.
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String tarefa;

        menu();
        int opcao = scanner.nextInt();
        
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    tarefa = scanner.next();
                    adicionarTarefa(lista, tarefa);
                    break;
                case 2:
                    System.out.print("Digite a tarefa a ser removida: ");
                    tarefa = scanner.next();
                    removerTarefa(lista, tarefa);
                    break;
                case 3:
                    exibirTarefasRestantes(lista);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            scanner.close();
        }

    // Método para adicionar uma tarefa
    public static void adicionarTarefa(List<String> lista , String tarefa){
        if (lista.contains(tarefa)){
            System.out.println("A tarefa já existe na lista.");
        } else {
            lista.add(tarefa);
            System.out.println("Tarefa adicionada: " + tarefa);
        }
    }
    
    // Método para remover uma tarefa
    public static void removerTarefa(List<String> lista, String tarefa){
        if (lista.contains(tarefa)){
            lista.remove(tarefa);
            System.out.println("Tarefa removida: " + tarefa);
        } else {
            System.out.println("A tarefa não existe na lista");
        }
    }

    // Método para exibir o número de tarefas restantes
    public static void exibirTarefasRestantes(List<String> lista){
        System.out.println("Número de tarefas restantes: " + lista.size());
        System.out.println("Tarefas restantes: " + lista);
    }

    //Menu
    public static void menu(){
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Remover tarefa");
        System.out.println("3. Exibir tarefas restantes");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

}
