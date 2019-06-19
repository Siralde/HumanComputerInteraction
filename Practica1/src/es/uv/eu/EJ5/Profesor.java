package es.uv.eu.EJ5;

import es.uv.eu.EJ5.Alumno;
import java.util.HashSet;

public class Profesor {

    public final static int FRANCES = 0, INGLES = 1, ALEMAN = 2;
    private static final String[] idiomasDisponibles = {"Frances", "Ingles", "Aleman"};
    private int idiomaProfesor;
    private static int proximoCodigo = 1;
    private int codigoProfesor;
    private String nombreProfesor;
    private int nativo;
    private HashSet<Alumno> estudiantes;

    public Profesor(String nombre, int idioma, int nativo) {
        estudiantes = new HashSet<Alumno>();
        nombreProfesor = nombre;
        idiomaProfesor = idioma;
        codigoProfesor = proximoCodigo;
        proximoCodigo = proximoCodigo + 1;
        this.nativo = nativo;
    }

    /**
     * Devuelve el codigo del profesor
     *
     * @retval Codigo del profesor
     */
    public String getCodigo() {
        String codigo = "";

        if (codigoProfesor < 10) {
            codigo = "00" + codigoProfesor;
        } else if (codigoProfesor < 100) {
            codigo = "0" + codigoProfesor;
        } else {
            codigo = Integer.toString(codigoProfesor);
        }

        return codigo;
    }

    /**
     * Anyade un alumno al conjunto de alumnos del profesor
     *
     * @param estudiante Estudiante que debe anyadirse
     * @retval verdadero si la operacion ha tenido exito o falso sino cabe
     */
    public boolean add(Alumno alu) {
        return estudiantes.add(alu);
    }

    public String toString() {
        String resultado = "";

        resultado = "Nombre: " + nombreProfesor + " Idioma: " + idiomasDisponibles[idiomaProfesor]
                + " Codigo: " + this.getCodigo() + "\n";
        for (Alumno alu : estudiantes) {
            resultado = resultado + alu.toString() + "\n";
        }

        return resultado;
    }
}
