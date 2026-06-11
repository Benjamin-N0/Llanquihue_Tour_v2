package model;

/**
 *
 * @author Gamer
 */
public class Tour {
    
    // Atributos de la clase
    private String nombre;
    private String region;
    private int precio;
    
    // Constructor con parámetros
    public Tour(String nombre, String region, int precio) {
        this.nombre = nombre;
        this.region = region;
        this.precio = precio;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
// Método toString para mostrar la información del objeto
@Override
public String toString(){
return nombre + " | region: " + region + " | precio: " + precio;

}
    
    
    
}
