
package Ajustes.Modelo;

public class Marca {
    private int id;
    private String fecha;
    private String marca;
    private String descripcion;
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        fecha = "" + rows.get(1);
        marca = "" + rows.get(2);
        descripcion = "" + rows.get(3);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "fecha", "marca", "descripcion"};
        return(cols);
    }
    
     public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + fecha + "'",
            "'" + marca + "'",
            "'" + descripcion + "'"
        };
        return(rows);
    }//Fin getSqlRows
     
     public String getSqlTable()
    {
        return("marca");
    }
     
     // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
}
