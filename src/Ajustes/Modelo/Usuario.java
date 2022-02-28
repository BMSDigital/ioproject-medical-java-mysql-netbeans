package Ajustes.Modelo;
/*Main principal del sistema..
    *Fraibert Bracho    
    *Cedula: 22270634
    *Mi primer Systema auditado
    *Derecho reservado 
*/
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String user;
    private String passw;
    private String email;
    private String telefono;
    private String estado;
    private String nivel_acceso;
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( "" + rows.get(0));
        nombre = "" + rows.get(1);
        apellido = "" + rows.get(2);
        user = "" + rows.get(3);
        passw = "" + rows.get(4);
        email = "" + rows.get(5);
        telefono = "" + rows.get(6);
        estado = "" + rows.get(7);
        nivel_acceso = "" + rows.get(8);
    }
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "nombre", "apellido", "user", "passw", "email", "telefono", "estado", "nivel_acceso"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + id,
            "'" + nombre + "'",
            "'" + apellido + "'",
            "'" + user + "'",
            "'" + passw + "'",
            "'" + email + "'",
            "'" + telefono + "'",
            "'" + estado + "'",
            "'" + nivel_acceso + "'"
        };
        return(rows);
    }//Fin getSqlRows
    
    public String getSqlTable()
    {
        return("usuario");
    }
    
    // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(String nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }
    
}
