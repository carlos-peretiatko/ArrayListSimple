import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    //Coloque 5 elementos em uma Array List e ordene-os
    public static void main(String[] args){
      
        List<String> lista = new ArrayList<>();

        //add
        lista.add("banana");
        lista.add("maçã");
        lista.add("laranja");
        lista.add("uva");
        lista.add("abacaxi");

        System.out.println("Lista antes da ordenação: " + lista);

        //mudando a ordem da lista

        lista.sort(null);
        System.out.println("Lista depois da ordenação: " + lista);
    }
}
