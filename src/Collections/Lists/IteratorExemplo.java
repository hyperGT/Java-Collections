package Collections.Lists;
import java.util.*;

public class IteratorExemplo {


    public static void main(String[] args) {
    //exemplo de uso:

        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 9d, 8.9, 2.6, 4d));

        System.out.println(notas.toString());
        System.out.println("Maior nota: " + Collections.max(notas)
                + "\nMenor Nota: " + Collections.min(notas));

        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma das notas da lista: " + soma);
        System.out.println("Média das notas: " + (soma/notas.size()));

        //limpa a lista
        notas.clear();

        System.out.println("Esta vazia? " + notas.isEmpty());
    }
}
