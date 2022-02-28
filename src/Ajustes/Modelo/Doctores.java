
package Ajustes.Modelo;

import java.awt.Image;
import java.io.FileInputStream;

public class Doctores {
    private int id;
    private String especializacion;
    private String nombre;
    private String apellido;
    private String cedula;
    private String areacedula;
    private String mpps;
    private String codigo_medico;
    private String lugar_nacimiento;
    private String direccion;
    private String correo;
    private String areacorreo;
    private String areatelefono;
    private String telefono;
    private String cantidad_citas;
    private String fecha_desde;
    private String fecha_hasta;
    
    Image imagen;
    String firma;

     // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( "" + rows.get(0));
        especializacion = "" + rows.get(1);
        nombre = "" + rows.get(2);
        apellido = "" + rows.get(3);
        cedula = "" + rows.get(4);
        areacedula = "" + rows.get(5);
        mpps = "" + rows.get(6);
        codigo_medico = "" + rows.get(7);
        lugar_nacimiento = "" + rows.get(8);
        direccion = "" + rows.get(9);
        correo = "" + rows.get(10);
        areacorreo = "" + rows.get(11);
        areatelefono = "" + rows.get(12);
        telefono = "" + rows.get(13);
        cantidad_citas = "" + rows.get(14);
        fecha_desde = "" + rows.get(15);
        fecha_hasta = "" + rows.get(16);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "especializacion", "nombre", "apellido","cedula", "areacedula","mpps", "codigo_medico", "lugar_nacimiento","direccion", "correo", "areacorreo", "areatelefono", "telefono","cantidad_citas", "fecha_desde", "fecha_hasta"};
        return(cols);
    }
    
     public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + id,
            "'" + especializacion + "'",
            "'" + nombre + "'",
            "'" + apellido + "'",
            "'" + cedula + "'",
            "'" + areacedula + "'",
            "'" + mpps + "'",
            "'" + codigo_medico + "'",
            "'" + lugar_nacimiento + "'",
            "'" + direccion + "'",
            "'" + correo + "'",
            "'" + areacorreo + "'",
            "'" + areatelefono + "'",
            "'" + telefono + "'",
            "'" + cantidad_citas + "'",
            "'" + fecha_desde + "'",
            "'" + fecha_hasta + "'"
        };
        return(rows);
    }//Fin getSqlRows
   
    public String getSqlTable()
    {
        return("doctores");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
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

    public String getMpps() {
        return mpps;
    }

    public void setMpps(String mpps) {
        this.mpps = mpps;
    }

    public String getCodigo_medico() {
        return codigo_medico;
    }

    public void setCodigo_medico(String codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
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

    public String getCantidad_citas() {
        return cantidad_citas;
    }

    public void setCantidad_citas(String cantidad_citas) {
        this.cantidad_citas = cantidad_citas;
    }

    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

}
