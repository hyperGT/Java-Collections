package Collections.Map;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MapExemplo {

    public static void main(String[] args) {

        //exemplo de map
        Map<String, Integer> Carro = new HashMap<>() {{
            put("Uno", 20);
            put("Hb20", 100);
        }};

        System.out.println(Carro.containsKey("Uno")); //verifica se existe essa chave dentro do map

        System.out.println(Carro.get("BMW")); //captura e retorna o valor da chave digitada

        Set<String> modelos = Carro.keySet();//retorna as chaves atraves de uma collection (Set)
        System.out.println(modelos);

        Collection<Integer> kmsRodados = Carro.values();//retorna os valores
        System.out.println(kmsRodados);



    }

}
