
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Edgardo
 */
public class Alumnos {

    private String nombres;
    private ArrayList <Integer> notas;

    public Alumnos(String nombres, ArrayList<Integer> notas) {
        this.nombres = nombres;
        this.notas = new ArrayList();
    }

    public Alumnos() {
        this.notas = new ArrayList();
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas.add(notas);
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombres=" + nombres + ", notas=" + notas + '}';
    }
    
    
}
