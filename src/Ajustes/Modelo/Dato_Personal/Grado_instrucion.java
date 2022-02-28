package Ajustes.Modelo.Dato_Personal;

public class Grado_instrucion {
    private int id;
    private String grado;
    
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        grado = "" + rows.get(1);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "grado"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + grado + "'"
        };
        return(rows);
    }//Fin getSq publiclRows
     
     public String getSqlTable()
    {
        return("grado_instrucion");
    }
     
     // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
