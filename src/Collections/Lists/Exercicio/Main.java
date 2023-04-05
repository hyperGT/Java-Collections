package Collections.Lists.Exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    /*
     * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
     * e armazene-os em uma lista
     * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média
     * e em que mês elas ocorreram(mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro etc)
     */

    public static void main(String[] args) {

        //adicionando a lista contendo os meses e as temperaturas no mesmo índice
        List<TemperaturaSemestral> temperaturaSemestralList = new ArrayList<>();

        temperaturaSemestralList.add(new TemperaturaSemestral("Janeiro", 20d));
        temperaturaSemestralList.add(new TemperaturaSemestral("Fevereiro", 14.4));
        temperaturaSemestralList.add(new TemperaturaSemestral("Março", 32.2d));
        temperaturaSemestralList.add(new TemperaturaSemestral("Abril", 30d));
        temperaturaSemestralList.add(new TemperaturaSemestral("Maio", 28.5));
        temperaturaSemestralList.add(new TemperaturaSemestral("Junho", 21.2));

        System.out.println(temperaturaSemestralList);

        Iterator<TemperaturaSemestral> semestralIterator = temperaturaSemestralList.iterator();
        Iterator<TemperaturaSemestral> semestralIterator2 = temperaturaSemestralList.iterator();

        //soma das temperaturas, e obtendo a média
        Double media = 0d;
        while (semestralIterator.hasNext()) {
            Double next = semestralIterator.next().getTemperaturaMedia();
            media += next;
        }
            media /= temperaturaSemestralList.size();

        while (semestralIterator2.hasNext()) {
            Double next = semestralIterator2.next().getTemperaturaMedia();
            if (next < media){
                semestralIterator2.remove();
            }
        }

        System.out.println(temperaturaSemestralList.toString());

        /*for(int i=0 ; i < temperaturaSemestralList.size() ; i++){


        }*/

        //System.out.printf("A média semestral da temperatura é %.1f°C", media);


    }

}


