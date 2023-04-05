package Collections.Set;

import Collections.Set.Auxiliar.Series;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoExemplo {

    public static void main(String[] args) {

        //ordem Aleatoria
        Set<Series> setSeries = new HashSet<>() {{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};

        for (Series series : setSeries) {
            System.out.println(series.getNome() + " - "
                    + series.getGenero() + " - "
                    + series.getTempoEp());
        }

        //ordem de inserção
        Set<Series> linkedSeries = new LinkedHashSet<>() {{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};

        for (Series series : linkedSeries) {
            System.out.println(series.getNome() + " - "
                    + series.getGenero() + " - "
                    + series.getTempoEp());
        }

        //ordem por tempo de Episodio usando TreeSet
        Set<Series> arvoreDeSeries = new TreeSet<>(linkedSeries);
        for (Series series : arvoreDeSeries) {
            System.out.println(series.getNome() + " - "
                    + series.getGenero() + " - "
                    + series.getTempoEp());
        }
    }
}


