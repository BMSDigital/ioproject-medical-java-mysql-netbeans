package Ajustes.Modelo.Dato_Personal;

public class Tipo_paciente {
    private int id;
    private String tipo_paci;
    
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        tipo_paci = "" + rows.get(1);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "tipo_paci"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + tipo_paci + "'"
        };
        return(rows);
    }//Fin getSq publiclRows
     
     public String getSqlTable()
    {
        return("tipo_paci");
    }
     
     // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_paci() {
        return tipo_paci;
    }

    public void setTipo_paci(String tipo_paci) {
        this.tipo_paci = tipo_paci;
    }
}
