
package Ajustes.Modelo;

public class Unidades {
    private int id;
    private String fecha;
    private String medida;
    private String prefijo;
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        fecha = "" + rows.get(1);
        medida = "" + rows.get(2);
        prefijo = "" + rows.get(3);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "fecha", "medida", "prefijo"};
        return(cols);
    }
    
     public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + fecha + "'",
            "'" + medida + "'",
            "'" + prefijo + "'"
        };
        return(rows);
    }//Fin getSqlRows
     
    public String getSqlTable()
    {
        return("unidades");
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
    
}
