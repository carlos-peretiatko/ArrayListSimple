import java.util.List; 
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    //Faça um algoritmo que descubra se uma Array List possui o número que o usuário entrou.
    //Imprima também o seu índice
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();
        //add
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        //Verificando
        for(int i = 0; i < lista.size(); i++){
            if(numero == lista.get(i)){
                System.out.println("O número " + numero + " está na lista e seu índice é: " + (i + 1));
                break; //sai
            } else {
                System.out.println("O número " + numero + " não está na lista.");
                break; //sai
            }
        }

        scanner.close();
    }

}
