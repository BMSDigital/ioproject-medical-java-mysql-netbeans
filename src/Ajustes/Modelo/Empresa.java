package Ajustes.Modelo;

public class Empresa {
    private int id;
    private String fecha;
    private String nombre;
    private String apartamento;
    private String direccion;   
    private String telefono;
    private String correo;
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        fecha = "" + rows.get(1);
        nombre = "" + rows.get(2);
        apartamento = "" + rows.get(3);
        direccion = "" + rows.get(4);
        nombre = "" + rows.get(5);
        correo = ""+ rows.get(6);    
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "fecha", "nombre", "apartamento", "direccion", "telefono", "correo"};
        return(cols);
    }
    
     public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + fecha + "'",
            "'" + nombre + "'",
            "'" + apartamento + "'",
            "'" + direccion + "'",
            "'" + telefono + "'",
            "'" + correo + "'"
        };
        return(rows);
    }//Fin getSqlRows
     
     public String getSqlTable()
    {
        return("empresa");
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     
}
