package Ajustes.Modelo;

public class Proveedores {
    private int id;
    private String fecha;
    private String proveedor;
    private String rif;
    private String direccion;   
    private String telefono;
    private String correo;
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        fecha = "" + rows.get(1);
        proveedor = "" + rows.get(2);
        rif = "" + rows.get(3);
        direccion = "" + rows.get(4);
        telefono = "" + rows.get(5);
        correo = ""+ rows.get(6);    
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "fecha", "proveedor", "rif", "direccion", "telefono", "correo"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + fecha + "'",
            "'" + proveedor + "'",
            "'" + rif + "'",
            "'" + direccion + "'",
            "'" + telefono + "'",
            "'" + correo + "'"
        };
        return(rows);
    }//Fin getSqlRows
    
    public String getSqlTable()
    {
        return("proveedores");
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

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
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
