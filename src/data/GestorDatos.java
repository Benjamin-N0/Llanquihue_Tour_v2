package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Tour;
/**
 *
 * @author Gamer
 */
public class GestorDatos {
    // Método que recibe la ruta del archivo y retorna una lista de videojuegos
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // Lista dinámica donde se almacenarán los videojuegos
        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            // Se abre el archivo para lectura
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            
            // Lectura linea por linea
            String linea;

            // Se lee el archivo línea por línea
            while ((linea = lector.readLine()) != null) {

                // Se separa la línea usando punto y coma ;
                String[] partes = linea.split(";");

                // Se valida que la línea tenga 3 datos
                if (partes.length == 3) {

                    // Se convierten los datos al tipo correspondiente
                    String nombre = partes[0];
                    String region = partes[1];
                    int precio = Integer.parseInt(partes[2]);

                    // Se crea un objeto Tour con los datos leídos
                    Tour tour = new Tour(nombre, region, precio);

                    // Se agrega el objeto a la lista
                    listaTours.add(tour);
                }
            }

            // Se cierra el lector
            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Se retorna la lista con los tours cargados
        return listaTours;
    }
    
    
    
    
    
    
    
}
