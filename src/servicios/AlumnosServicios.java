package servicios;

import entidad.Alumnos;
import java.util.Scanner;

public class AlumnosServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumnos cargaNotas() {
        
        Alumnos a1 = new Alumnos();
        
        System.out.println("Ingrese el nombre del Alumno...");
        a1.setNombres(leer.next());
       
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una nota " + (i+1) + " = ");
            a1.setNotas(leer.nextInt());
        }
        return a1;
    }
    
    public void mostrar(Alumnos a1){
    
//        System.out.println("El alummno  " + a1.getNombres());
//        System.out.println("Y sus notas son: ");
        for (Integer object : a1.getNotas()) {
            System.out.println(object);
        }
        
        }
     public void notaFinal(Alumnos a1){
         System.out.println(a1);
         Integer suma=0;
         for (Integer object : a1.getNotas()) {
              suma += object;
             
         }
         Double promedio = (double)suma/a1.getNotas().size();
         
         System.out.println(promedio);
    }

}
