package ui;

import data.GestorDatos;
import java.util.ArrayList;
import model.Tour;


public class Main {

    public static void main(String[] args) {
       
         // Ruta del archivo de texto
        String rutaArchivo = "resources/tours.txt";
     
        // Se crea un objeto de la clase GestorDatos
        GestorDatos gestor = new GestorDatos();
        
        // Se carga la lista de tours desde el archivo
        ArrayList<Tour> tours = gestor.cargarTours(rutaArchivo);
        
        // Mostrar todos los tours cargados
        System.out.println("===== CATALOGO DE LLANQUIHUE TOUR =====\n");
        
        // Recorrer una liste de objetos
        for (Tour tour : tours) {
            System.out.println(tour);
        }
        
        // Filtrar tours solo de region los lagos
        System.out.println("\n===== TOURS DE REGION LOS LAGOS =====\n");
        
            for (Tour tour : tours) {
            if (tour.getRegion().equalsIgnoreCase("Los Lagos")) {
                System.out.println(tour);
            }
        }
        
        
    }
    
}
