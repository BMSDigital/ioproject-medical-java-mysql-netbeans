
package Ajustes.Modelo;

public class Categoria 
{
    private int id_codigo;
    private String fecha;
    private String categoria;
    private String descripcion;
    
    char status = 0;
    // Getters And Setters

    public int getId_codigo() {
        return id_codigo;
    }

    public void setId_codigo(int id_codigo) {
        this.id_codigo = id_codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id_codigo = Integer.parseInt( (String ) rows.get(0));
        fecha = "" + rows.get(1);
        categoria = "" + rows.get(2);
        descripcion = "" + rows.get(3);
        status = ("" +rows.get(4)).charAt(0);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id_codigo", "fecha", "categoria", "descripcion","status"};
        return(cols);
    }
    
     public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + fecha + "'",
            "'" + categoria + "'",
            "'" + descripcion + "'",
            "'" + status + "'"
        };
        return(rows);
    }//Fin getSqlRows
     
    public String getSqlTable()
    {
        return("categoria");
    }
}
