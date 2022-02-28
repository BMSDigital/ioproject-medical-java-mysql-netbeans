
package Ajustes.Modelo;

public class Paciente {
    private int id;
    private String cedula;
    private String areacedula;
    private String nombre;
    private String apellido;
    private String sexo;
    private String fecha_nacimiento;
    private String lugar_nacimiento;
    private String tipo_paciente;
    private String direccion;
    private String correo;
    private String areacorreo;
    private String estado_civil;
    private String grado_instrucion;
    private String profesion;
    private String ocupacion;
    private String areatelefono;
    private String telefono;
    private String coct_nombre;
    private String coct_apellido;
    private String coct_areacedula;
    private String coct_cedula;
    private String coct_parentesco;
    private String coct_areatelefono;
    private String coct_telefono;

     // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( "" + rows.get(0));
        cedula = "" + rows.get(1);
        areacedula = "" + rows.get(2);
        nombre = "" + rows.get(3);
        apellido = "" + rows.get(4);
        sexo = "" + rows.get(5);
        fecha_nacimiento = "" + rows.get(6);
        lugar_nacimiento = "" + rows.get(7);
        tipo_paciente = "" + rows.get(8);
        direccion = "" + rows.get(9);
        correo = "" + rows.get(10);
        areacorreo = "" + rows.get(11);
        estado_civil = "" + rows.get(12);
        grado_instrucion = "" + rows.get(13);
        profesion = "" + rows.get(14);
        ocupacion = "" + rows.get(15);
        areatelefono = "" + rows.get(16);
        telefono = "" + rows.get(17);
        coct_nombre = "" + rows.get(18);
        coct_apellido = "" + rows.get(19);
        coct_areacedula = "" + rows.get(20);
        coct_cedula = "" + rows.get(21);
        coct_parentesco = "" + rows.get(22);
        coct_areatelefono = "" + rows.get(23);
        coct_telefono = "" + rows.get(24);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "cedula", "areacedula", "nombre", "apellido", "sexo", "fecha_nacimiento", "lugar_nacimiento", "tipo_paciente", "direccion", "correo", "areacorreo", "estado_civil", "grado_instrucion", "profesion", "ocupacion", "areatelefono", "telefono", "coct_nombre", "coct_apellido", "coct_areacedula", "coct_cedula", "coct_parentesco", "coct_areatelefono", "coct_telefono"};
        return(cols);
    }
    
     public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + id,
            "'" + cedula + "'",
            "'" + areacedula + "'",
            "'" + nombre + "'",
            "'" + apellido + "'",
            "'" + sexo + "'",
            "'" + fecha_nacimiento + "'",
            "'" + lugar_nacimiento + "'",
            "'" + tipo_paciente + "'",
            "'" + direccion + "'",
            "'" + correo + "'",
            "'" + areacorreo + "'",
            "'" + estado_civil + "'",
            "'" + grado_instrucion + "'",
            "'" + profesion + "'",
            "'" + ocupacion + "'",
            "'" + areatelefono + "'",
            "'" + telefono + "'",
            "'" + coct_nombre + "'",
            "'" + coct_apellido + "'",
            "'" + coct_areacedula + "'",
            "'" + coct_cedula + "'",
            "'" + coct_parentesco + "'",
            "'" + coct_areatelefono + "'",
            "'" + coct_telefono + "'"
        };
        return(rows);
    }//Fin getSqlRows
   
    public String getSqlTable()
    {
        return("paciente");
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getAreacedula() {
        return areacedula;
    }

    public void setAreacedula(String areacedula) {
        this.areacedula = areacedula;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getTipo_paciente() {
        return tipo_paciente;
    }

    public void setTipo_paciente(String tipo_paciente) {
        this.tipo_paciente = tipo_paciente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getAreacorreo() {
        return areacorreo;
    }

    public void setAreacorreo(String areacorreo) {
        this.areacorreo = areacorreo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getGrado_instrucion() {
        return grado_instrucion;
    }

    public void setGrado_instrucion(String grado_instrucion) {
        this.grado_instrucion = grado_instrucion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getAreatelefono() {
        return areatelefono;
    }

    public void setAreatelefono(String areatelefono) {
        this.areatelefono = areatelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCoct_nombre() {
        return coct_nombre;
    }

    public void setCoct_nombre(String coct_nombre) {
        this.coct_nombre = coct_nombre;
    }

    public String getCoct_apellido() {
        return coct_apellido;
    }

    public void setCoct_apellido(String coct_apellido) {
        this.coct_apellido = coct_apellido;
    }

    public String getCoct_areacedula() {
        return coct_areacedula;
    }

    public void setCoct_areacedula(String coct_areacedula) {
        this.coct_areacedula = coct_areacedula;
    }

    public String getCoct_cedula() {
        return coct_cedula;
    }

    public void setCoct_cedula(String coct_cedula) {
        this.coct_cedula = coct_cedula;
    }

    public String getCoct_parentesco() {
        return coct_parentesco;
    }

    public void setCoct_parentesco(String coct_parentesco) {
        this.coct_parentesco = coct_parentesco;
    }

    public String getCoct_areatelefono() {
        return coct_areatelefono;
    }

    public void setCoct_areatelefono(String coct_areatelefono) {
        this.coct_areatelefono = coct_areatelefono;
    }

    public String getCoct_telefono() {
        return coct_telefono;
    }

    public void setCoct_telefono(String coct_telefono) {
        this.coct_telefono = coct_telefono;
    }

    
  
}
