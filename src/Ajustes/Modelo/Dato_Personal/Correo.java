
package Ajustes.Modelo.Dato_Personal;

public class Correo {
    private int id;
    private String correo;
    
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        correo = "" + rows.get(1);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "correo"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + correo + "'"
        };
        return(rows);
    }//Fin getSq publiclRows
     
     public String getSqlTable()
    {
        return("correo");
    }
     
     // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
