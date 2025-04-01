import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    //Crie uma Array List
    //O usuário vai colocando valores decimais até ele colocar o número 0.
    //Calcular:
    //a) Qual o menor número
    //b) Qual o maior número
    //c) Calcular a média
    public static void main(String[] args) {
        
        List<Double> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double numero = -1; //chave
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;

        // Loop para receber os números do usuário
        while (numero != 0) {
            System.out.print("Digite um número decimal (0 para sair): ");
            numero = scanner.nextDouble();
            if (numero != 0) {
                lista.add(numero);
                // Verifica se o número é menor ou maior que os valores atuais
                if (numero < menor) {
                    menor = numero; 
                } else if (maior < numero) {
                    maior = numero;
                }
                soma += numero;
            }
        }
        //print
        System.out.println("\nLista: " + lista);
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + (soma / lista.size())); ;

        scanner.close();
    }
    
}
