package es.uv.eu.aplicacion1;

import java.util.HashSet;

public class PeliculaModel {

    private HashSet<Pelicula> peliculas;

    public PeliculaModel() {
        peliculas = new HashSet<>();
    }

    /**
     * Anyade una pelicula a la coleccion
     *
     * @param p La pelicula que debe anyadirse
     * @return verdadero si la operacion ha tenido exito o falso si no cabe
     */
    public boolean add(Pelicula p) {
        return peliculas.add(p);
    }

    public int getAntigua() {
        int antigua = 999999;
        
        for(Pelicula pel : peliculas)
        {
            if(pel.getAnyo()<= antigua)
                antigua = pel.getAnyo();
        }

        return antigua;
    }

    public int getNueva() {
        int nueva = -9;
        
         for(Pelicula pel : peliculas)
        {
            if(pel.getAnyo()>= nueva)
                nueva = pel.getAnyo();
        }

        return nueva;
    }

    public int getNumElementos() {
        return peliculas.size();
    }

    @Override
    public String toString() {
        String resultado = "";
        for (Pelicula p : peliculas) {
            resultado = resultado + p.toString() + "\n";
        }
        return resultado;
    }
}
