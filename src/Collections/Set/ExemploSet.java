package Collections.Set;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {

        //Exemplo de Set(conceito de pilha)
        Set<Double> notasSet = new HashSet<>(); //Arrays.asList() tbm funciona

        System.out.println(notasSet.isEmpty()); // true

        notasSet.add(1d); //adiciona um valor na pilha

        notasSet.size(); //retorna o tamanho da pilha

        //com esse set padrão não é possivel usar metodos get, justamente por não existir indice nenhum
        //notasSet.get(0);

        //os valores sempre serão mostrados em posições aleatorias
        notasSet.add(7d);
        notasSet.add(3d);
        notasSet.add(3.4);
        System.out.println(notasSet);

        //não é possivel guardar valores repetidos
        notasSet.add(7d);
        System.out.println(notasSet);

        notasSet.contains(3.4); //metodo contains
        notasSet.clear();//apaga todos os elementos

        //esse aqui ja guarda os elementos na ordem em que foram inseridos
        Set<Double> notasLinkedHashSet = new LinkedHashSet<>(Arrays.asList(3d, 4d, 5d, 3.5));


        notasLinkedHashSet.add(8.7);
        System.out.println(notasLinkedHashSet);

        //Uso do TreeSet
        Set<Double> notasTreeSet = new TreeSet<>(notasLinkedHashSet); //compareTo
        System.out.println(notasTreeSet);


        notasTreeSet.clear(); //limpa a lista


    }
}
