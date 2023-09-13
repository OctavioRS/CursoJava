package ListarPersonas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prueba {

    public static void main(String[] args){

        
        Persona messi = new Persona("Lionel", "Messi");
        Persona fideo = new Persona("Angel", "DiMaria");
        Persona cuti = new Persona("Cuti", "Romero");
        Persona colo = new Persona("Alexis", "MacAllister");
        Persona toro = new Persona("Lautaro", "Martinez");

        
        List<Persona> personas = new ArrayList<>();
        personas.add(messi);
        personas.add(fideo);
        personas.add(cuti);
        personas.add(colo);
        personas.add(toro);

       
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        });

        
        System.out.println("Ordenado por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }

       
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona1.getApellido().compareTo(persona2.getApellido());
            }
        });

       
        System.out.println("\nOrdenado por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }

        
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona1, Persona persona2) {
                return persona2.getApellido().compareTo(persona1.getApellido());
            }
        });

        
        System.out.println("\nOrdenado inversamente por apellido:");
        for (Persona persona : personas) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }
    }
}
