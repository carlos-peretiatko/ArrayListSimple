import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ex7 {
    //Faça um algoritmo que verifica palíndromos
    //O usuário insere uma palavra.
    //Crie uma ArrayList<Character> com os caracteres da palavra.
    //Verifique se a palavra é um palíndromo
    //Dica: use Collections.reverse() 
    public static void main(String[] args) {

        List<Character> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        // Adicionando os caracteres da palavra na lista
        for (char c : palavra.toCharArray()) {
            lista.add(c);
        }

        //Criando uma cópia da lista original
        List<Character> listaInvertida = new ArrayList<>(lista);

        // Invertendo a lista
        Collections.reverse(listaInvertida);

        if (lista.equals(listaInvertida)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
            
        }
    scanner.close();
    }

}
