/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
 * tipo Integer con sus 3 notas.
 * En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
 * información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bluce tendremos el siguiente método en la clase Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
 * nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
 * Dentro del método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package principal;

import entidad.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicios.AlumnosServicios;

/**
 *
 * @author Edgardo
 */
public class ClaseMain {

    public static void main(String[] args) {

        AlumnosServicios serv = new AlumnosServicios();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumnos> listaAlu = new ArrayList();
        Alumnos a1 = new Alumnos();
        
        String rta = "";
        do {

            listaAlu.add(serv.cargaNotas());
            System.out.println("Desea ingresar otro Alumno??");
            rta = leer.next();
        } while (rta.equalsIgnoreCase("si"));
        
        System.out.println("===================================");
        
        Iterator<Alumnos> it = listaAlu.iterator();  //Copio el ArrayList al Iterator
        System.out.print("Ingrese el alumono que desea conocer la nota final = ");
        String busca = leer.next();
        
        while (it.hasNext()) {
            a1=it.next();
            String aux = a1.getNombres();

            if (aux.equalsIgnoreCase(busca)) {       //Metodo iterar

                serv.notaFinal(a1);
                
                
            }
                   

        }
        }
    }


