package Ajustes.Modelo.Dato_Personal;

public class Cedula {
    private int id;
    private String cedula;
    
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        cedula = "" + rows.get(1);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id","cedula"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + cedula + "'"
        };
        return(rows);
    }//Fin getSq publiclRows
     
     public String getSqlTable()
    {
        return("cedula");
    }
     
     // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
