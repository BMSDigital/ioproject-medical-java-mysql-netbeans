package Ajustes.Modelo;

public class Inventario {
    private int id;
    private String fecha;
    private String nombre;
    private String modelo;
    private String serial;   
    private int stock;
    private String ubicacion;
    private String estado;
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        fecha = "" + rows.get(1);
        nombre = "" + rows.get(2);
        modelo = "" + rows.get(3);
        serial = "" + rows.get(4);
        stock = Integer.parseInt(( String ) rows.get(5));
        ubicacion = ""+ rows.get(6);    
        estado = ""+ rows.get(7);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "fecha", "nombre", "modelo", "serial", "stock", "ubicacion","estado"};
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
            "'" + modelo + "'",
            "'" + serial + "'",
            "" + stock,
            "'" + ubicacion + "'",
            "'" + estado + "'"
        };
        return(rows);
    }//Fin getSqlRows
    
    public String getSqlTable()
    {
        return("inventario");
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
