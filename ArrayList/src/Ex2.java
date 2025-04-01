import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
    //Crie uma Array List e imprima os últimos elementos por primeiro
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();

        //add
        lista.add("Banana");
        lista.add("Maçã");
        lista.add("Laranja");
        lista.add("Uva");
        lista.add("Abacaxi");

        // Invertendo a lista
        Collections.reverse(lista);
        System.out.println("Lista depois da inversão: " + lista);


    }


}
