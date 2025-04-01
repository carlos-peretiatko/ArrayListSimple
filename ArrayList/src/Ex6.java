import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class Ex6 {
    //Crie uma lista de nomes
    //Faça métodos para:
    //Remover todos os nomes duplicados.
    //Exibir a lista sem duplicatas.
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite nomes (digite 'sair' para terminar):");
        
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            adicionarNome(list, nome);
        }
        
        System.out.println("\nLista original:");
        exibirLista(list);
        
        removerDuplicatas(list);
        
        System.out.println("\nLista sem duplicatas:");
        exibirLista(list);
        
        scanner.close();
    }

    // Método para adicionar um nome
    public static void adicionarNome(List<String> list, String nome){
        list.add(nome);
    }

    // Método para remover duplicatas
    public static void removerDuplicatas(List<String> list){
        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }
    
    // Método para exibir a lista
    public static void exibirLista(List<String> list) {
        for (String nome : list) {
            System.out.println(nome);
        }
    }
}