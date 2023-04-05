package Collections.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExemploList {

    public static void main(String[] args) {

        Random random = new Random(2134111);

        //quando queremos passar valores predefinidos, entretanto, há a possibilidade de alteração
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 5.2, 6d, 3.6, 9d));
        notas.add(2, 4d);

        System.out.println("Removido: " + notas.remove(2));
        System.out.println(notas);

        //lista imutável
        List<Integer> numeros = List.of(7, 5, 6, 3, 9);

        System.out.println(numeros.contains(9));

        //lista clássica + exercicio(gerar 7 numeros e adiciona-los a lista)
        List<Integer> listaDeNotas = new ArrayList<>();

        for(int i = 0 ; i < 7 ; i++){
            listaDeNotas.add(random.nextInt( 20));
        }
        System.out.println(listaDeNotas);

        System.out.println(listaDeNotas.get(5));




        //Dica: para ordenar os elementos, utilizamos a interface Comparable e implementando seu  método principal


    }
}
