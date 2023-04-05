package Collections.Map.Exercicio;

import java.util.*;
import java.util.function.Function;

public class ExercicioMap {

    /*Dadas as informações de id e contato, crie um dicionario e ordene exibindo Nome id - Nome contato
     *
     * Exemplo:
     * id = 1 - Contato = nome: Gabriel, numero: 99887;
     * */

    public static void main(String[] args) {

        //hash map
        System.out.println("--\tHashMap\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Gabriel", 99887));
            put(4, new Contato("Noelle-chan", 33442));
            put(3, new Contato("Ralu", 66643));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        //hash map linkado
        System.out.println("\n--\tLinkedHashMap\t--");
        Map<Integer, Contato> agendaLink = new LinkedHashMap<>() {{
            put(1, new Contato("Gabriel", 99887));
            put(4, new Contato("Noelle-chan", 33442));
            put(3, new Contato("Ralu", 66643));
        }};

        for (Map.Entry<Integer, Contato> entry : agendaLink.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        //ordem por id
        System.out.println("\n--\tTreeMap\t--");
        Map<Integer, Contato> agendaById = new TreeMap<>(agenda);

        for (Map.Entry<Integer, Contato> entry : agendaById.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }


        //utilizaçao de classe anonima, lambda, reference method
        System.out.println("\n--\tOrdem por numero de telefone\t--");
        /*
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
            }
        });
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }
*/
        /*
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> integerContatoEntry) {
                        return integerContatoEntry.getValue().getNumero();
                    }
                }));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }
        */

        //lambda
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(contatoEntry -> contatoEntry.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }
    }


}
