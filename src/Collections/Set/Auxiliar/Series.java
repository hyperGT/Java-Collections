package Collections.Set.Auxiliar;

import java.util.Objects;

public class Series implements Comparable<Series>{


    private String nome;
    private String genero;
    private Integer tempoEp;

    public Series(String nome, String genero, Integer tempoEp) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEp = tempoEp;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEp() {
        return tempoEp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(nome, series.nome) && Objects.equals(genero, series.genero) && Objects.equals(tempoEp, series.tempoEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEp);
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEp=" + tempoEp +
                '}';
    }

    @Override
    public int compareTo(Series series) {
        int tempoEp = Integer.compare(this.getTempoEp(), series.getTempoEp());
        if (tempoEp != 0) return tempoEp;

        return this.getGenero().compareTo(series.getGenero());
    }
}
