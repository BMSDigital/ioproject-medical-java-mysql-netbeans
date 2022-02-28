
package Ajustes.Modelo.Dato_Personal;

public class Estado {
    private int id;
    private String estado;
    
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        estado = "" + rows.get(1);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "estado"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + estado + "'"
        };
        return(rows);
    }//Fin getSq publiclRows
     
     public String getSqlTable()
    {
        return("estado");
    }
     
     // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
}
