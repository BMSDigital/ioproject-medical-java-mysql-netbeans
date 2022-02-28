
package Ajustes.Modelo.Dato_Personal;

import Ajustes.Modelo.Doctores;
import java.awt.Image;

public class CargarImagen extends Doctores {
    private int id;
    private Image imagen;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
}
