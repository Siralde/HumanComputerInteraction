package es.uv.eu.EJ5;

import javax.swing.JOptionPane;
import java.util.HashSet;

public class Academia {

    public static void main(String[] args) {
        HashSet<Profesor> academia;
        academia = new HashSet<Profesor>();
        Profesor profe;
        int continuar1 = 1, continuar2 = 1, nativo, idioma, nativo_real, niv_al;
        String nombre, nom_al;
        String[] idiomas = {"Frances", "Ingles", "Aleman"};
        String[] n_idioma = {"A1", "A2", "B1", "B2", "C1", "C2"};

        do {
            nombre = JOptionPane.showInputDialog(null, "Introduce nombre del Profesor ");
            idioma = JOptionPane.showOptionDialog(null, "Introduce el idioma ", "Idiomas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, idiomas, idiomas[0]);
            nativo = JOptionPane.showConfirmDialog(null, "Es su idioma nativo", "Seleccione la opcion deseada", JOptionPane.YES_NO_OPTION);

            if (nativo == 0) {
                nativo_real = 1;
            } else {
                nativo_real = 0;
            }

            profe = new Profesor(nombre, idioma, nativo_real);
            System.out.println(profe);

            do {
                nom_al = JOptionPane.showInputDialog(null, "Introducza el nombre de el alumno");
                niv_al = JOptionPane.showOptionDialog(null, "Introduce genero de la pelicula ", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, n_idioma, n_idioma[0]);

                Alumno al = new Alumno(nom_al, niv_al, Integer.parseInt(profe.getCodigo()));
                profe.add(al);
                //al.setId(Integer.parseInt(profe.getCodigo()));
                continuar2 = JOptionPane.showConfirmDialog(null, "Desea añadir otro alumno?", "Seleccione la opcion deseada", JOptionPane.YES_NO_OPTION);
            } while (continuar2 == 0);

            academia.add(profe);
            continuar1 = JOptionPane.showConfirmDialog(null, "Desea añadir otro Profesor?", "Seleccione la opcion deseada", JOptionPane.YES_NO_OPTION);
        } while (continuar1 == 0);
        JOptionPane.showMessageDialog(null, academia);
    }
}
