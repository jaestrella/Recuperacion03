package com.iesvirgendelcarmen.dam.recuperacion03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by matinal on 06/04/2018.
 */

public class Contenido {
    public static ArrayList<Lista_entrada>ENT_LISTA=new ArrayList<Lista_entrada>();
    public static Map<String,Lista_entrada>ENT_LISTA_HASMAP=new HashMap<String,Lista_entrada>();

    static {annadirEntrada(new Lista_entrada("1",R.drawable.ironman,"IRON MAN","Iron Man, cuyo nombre real es Anthony Edward Stark, mejor conocido como Tony Stark es un " +
                "superhéroe que aparece en los cómics publicados por Marvel Comics. Está casado con Pepper Potts."));
        annadirEntrada(new Lista_entrada("2",R.drawable.thanos,"THANOS","Es un personaje de Marvel Comics y supervillano creado por Jim Starlin y Mike Friedrich. Su nombre es en "+"" +
                "parte un juego de palabras que hace referencia al término griego Θάνατος (Thánatos), que significa muerte, pero principalmente es una deformación del nombre del dios de la muerte no violenta, Tánatos."));
        annadirEntrada(new Lista_entrada("3",R.drawable.deadpool,"DEADPOOL","Wade Winston Wilson, más conocido como Deadpool, es un personaje ficticio, mercenario, supervillano y antihéroe, "+"" +
                "que aparece en los cómics publicados por Marvel Comics. Creado por el artista Rob Liefeld y el escritor Fabian Nicieza. Deadpool apareció por primera vez en New Mutants (vol. 1) #98 (1991)."));}

    private static void annadirEntrada(Lista_entrada entrada){
        ENT_LISTA.add(entrada);
        ENT_LISTA_HASMAP.put(entrada.id,entrada);
    }

    public static class Lista_entrada{

        String id,textoEncima,textoDebajo;
        int idImagen;

        public Lista_entrada(String id, int idImagen,String textoEncima, String textoDebajo ) {
            this.id = id;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
            this.idImagen = idImagen;
        }
    }

}
