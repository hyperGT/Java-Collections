package Collections.Set.Exercicios;

import java.util.Objects;

public class LinguagensPreferidas implements Comparable<LinguagensPreferidas> {

    //deve possuir os atributos nome, anoDeCriacao e ide
    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    public LinguagensPreferidas(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "LinguagensPreferidas{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagensPreferidas linguagensPreferidas) {

        int nome = this.getIDE().compareTo(linguagensPreferidas.getIDE());
        if (nome != 0){
            return nome;
        }
        return this.getIDE().compareTo(linguagensPreferidas.getIDE());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagensPreferidas that = (LinguagensPreferidas) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(IDE, that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, IDE);
    }


}
