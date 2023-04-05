package Collections.Set.Exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagensPreferidasMain {

    public static void main(String[] args) {


        // Criar o conjunto com 3 linguagens
        Set<LinguagensPreferidas> linguagensPreferidas = new HashSet<>(){{
            add(new LinguagensPreferidas("Java", 1991, "IntelliJ"));
            add(new LinguagensPreferidas("JavaScript", 1995, "VS Code"));
            add(new LinguagensPreferidas("C#", 1999, "VS Code"));
        }};


        //fazer o programa ordenar por:

        System.out.println("--\tOrdem de inserção\t--");
        // Ordem de inserção
        Set<LinguagensPreferidas> linguagensLinkedHash = new LinkedHashSet<>(){{
            add(new LinguagensPreferidas("Java", 1991, "IntelliJ"));
            add(new LinguagensPreferidas("JavaScript", 1995, "VS Code"));
            add(new LinguagensPreferidas("C#", 1999, "VS Code"));
        }};

        for(LinguagensPreferidas linguagens : linguagensLinkedHash){
            System.out.println(linguagens.getNome() + " - " + linguagens.getAnoDeCriacao() + " - " + linguagens.getIDE());
        }

        /*
        //Ordem natural(nome) uso do Comparable
        System.out.println("\n--\tOrdenação por Nome\t--");
        Set<LinguagensPreferidas> linguagensTreeSet = new TreeSet<>(linguagensLinkedHash);

        for (LinguagensPreferidas linguagens1 : linguagensTreeSet){
            System.out.println(linguagens1.getNome() + " - " + linguagens1.getAnoDeCriacao() + " - " + linguagens1.getIDE());
        }
        */



        //IDE
        System.out.println("\n--\tOrdenação por Nome e IDE\t--");
        Set<LinguagensPreferidas> linguagensOrdemIDE = new TreeSet<>(linguagensLinkedHash);

        for (LinguagensPreferidas linguagens1 : linguagensOrdemIDE){
            System.out.println(linguagens1.getNome() + " - " + linguagens1.getAnoDeCriacao() + " - " + linguagens1.getIDE());
        }

        // Ano de criação e nome


        //nome, ano de criação e IDE


        //exibir as linguagens no console uma abaixo da outra(uso do forEach)
    }

}
