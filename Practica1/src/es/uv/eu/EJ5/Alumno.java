package es.uv.eu.EJ5;

/**
 *
 * @author Rulos
 */
public class Alumno {

    private int id_alumno;
    private String nombre;
    private static final String[] n_idioma = {"A1", "A2", "B1", "B2", "C1", "C2"};
    private int nivel_idioma, codigo_p;
    Profesor prof;
    private static int proximoId = 1;

    public Alumno(String nom, int nivel, int c_prof) {
        this.nombre = nom;
        this.nivel_idioma = nivel;
        id_alumno = proximoId;
        proximoId++;
        codigo_p = c_prof;
    }

    public String mostrarCodigo() {
        String codigo = "";

        if (codigo_p < 10) {
            codigo = "00" + codigo_p + getId();
        } else if (codigo_p < 100) {
            codigo = "0" + codigo_p + getId();
        } else {
            codigo = Integer.toString(codigo_p) + getId();
        }

        return codigo;
    }

    public String getId() {
        String codigo = "";
        if (id_alumno < 10) {
            codigo = "000" + id_alumno;
        } else if (id_alumno < 100) {
            codigo = "00" + id_alumno;
        } else if (id_alumno < 1000) {
            codigo = "0" + id_alumno;
        } else {
            codigo = Integer.toString(id_alumno);
        }

        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel_idioma;
    }

    public String getNivelGene() {
        return n_idioma[nivel_idioma];
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setNivel(int nivel) {
        this.nivel_idioma = nivel;
    }

    public String toString() {
        return "    Id alumno: " + this.mostrarCodigo() + " Nombre: " + nombre + " nivel:" + n_idioma[nivel_idioma];

    }

}
