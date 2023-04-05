package Collections.JavaStreams;


import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.stream.Collectors;

/**
 * <h3>As Streams API vieram para facilitar o uso de collections</h3>
 * Exemplos de uso abaixo
 */
public class UsandoStreams {

    public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        List<String> stringNumeros =
                Arrays.asList("2", "3", "5", "1", "7", "6", "4");

        //imprima todos os elementos da lista acima
//        Forma grosseira
//        numeros.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s)
//            }
//        });

        // Lambda
        //stringNumeros.forEach(s -> System.out.println(s));

        //Recolocando o lambda usando method reference  #soutc  #O resultado é o mesmo
        System.out.println("\n\tMostrandos os valores dentro da lista: \t\n");
        stringNumeros.forEach(System.out::println);

        System.out.println("\n---------------------------------------------");


        // pegue os 5 primeiros numeros e coloque dentro de um set
        System.out.println("\n\tSomente os 5 primeiros numeros\t\n");
        stringNumeros.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        // transformar essa lista de ‘strings’ numa lista de inteiros
        System.out.println("\n\tValores String transformados em inteiros\t");
        List<Integer> collectList =
                stringNumeros.stream()
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        System.out.println("\n\t"+collectList);


        // pegar os números pares e maiores que dois e coloca-los em uma lista

        System.out.println("\n\tSomente valores pares e maiores que dois\t");
        var collectListPares =
                collectList.stream()
                        .filter(i -> i % 2 == 0 && i > 2)
                        .toList();

        System.out.println("\n\t"+collectListPares);

        // mostrar a média dos valores da lista

        System.out.println("\n\tA média dos valores\t\n");
        stringNumeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        // remova os números ímpares da lista (use os números no formato Integer)

        System.out.println("\n\tSomente valores pares\t");
        collectList.removeIf(integer -> integer % 2 != 0);
        System.out.println("\n\t"+collectList);




    }

}
