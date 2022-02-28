package Ajustes.Modelo;

public class Paciente_Temp {
    private int id;
    private String fecha_temp;
    private String cedula_temp;
    private String areacedula_temp;
    private String nombre_temp;
    private String apellido_temp;
    private String sexo_temp;
    private String fecha_nacimiento_temp;
    private String lugar_nacimiento_temp;
    private String tipo_paciente_temp;
    private String direccion_temp;
    private String correo_temp;
    private String areacorreo_temp;
    private String telefono_temp;
    private String areatelefono_temp;
    private String estado_civil_temp;
    private String grado_instrucion_temp;
    private String profesion_temp;
    private String ocupacion_temp;
    private String coct_nombre_temp;
    private String coct_apellido_temp;
    private String coct_cedula_temp;
    private String coct_areacedula_temp;
    private String coct_parentesco_temp;
    private String coct_telefono_temp;
    private String coct_areatelefono_temp;
    
    // Funciones de MySql que requiere la libreria Egoist
    public void setSqlRows( java.util.ArrayList rows )
    {
        id = Integer.parseInt( (String ) rows.get(0));
        fecha_temp = "" + rows.get(1);
        cedula_temp = "" + rows.get(2);
        areacedula_temp = "" + rows.get(3);
        nombre_temp = "" + rows.get(4);
        apellido_temp = "" + rows.get(5);
        sexo_temp = "" + rows.get(6);
        fecha_nacimiento_temp = ""+ rows.get(7);    
        lugar_nacimiento_temp = ""+ rows.get(8);
        tipo_paciente_temp = ""+ rows.get(9);    
        direccion_temp = ""+ rows.get(10);
        correo_temp = ""+ rows.get(11);  
        areacorreo_temp = ""+ rows.get(12);  
        telefono_temp= ""+ rows.get(13);
        areatelefono_temp= ""+ rows.get(14);
        estado_civil_temp = ""+ rows.get(15);    
        grado_instrucion_temp= ""+ rows.get(16);
        profesion_temp = ""+ rows.get(17);    
        ocupacion_temp= ""+ rows.get(18);
        coct_nombre_temp = ""+ rows.get(19);    
        coct_apellido_temp= ""+ rows.get(20);
        coct_cedula_temp= ""+ rows.get(21);
        coct_areacedula_temp= ""+ rows.get(22);
        coct_parentesco_temp = ""+ rows.get(23);    
        coct_telefono_temp= ""+ rows.get(24);
        coct_areatelefono_temp= ""+ rows.get(25);
    }
    
    public String[] getSqlCols()
    {
        //Columnas
        String[] cols = {"id", "fecha_temp", "cedula_temp","areacedula_temp","nombre_temp", "apellido_temp", "sexo_temp", "fecha_nacimiento_temp", "lugar_nacimiento_temp","tipo_paciente_temp","direccion_temp","correo_temp","areacorreo_temp","telefono_temp","areatelefono_temp","estado_civil_temp","grado_instrucion_temp","profesion_temp","ocupacion_temp","coct_nombre_temp","coct_apellido_temp","coct_cedula_temp","coct_areacedula_temp","coct_parentesco_temp","coct_telefono_temp","coct_areatelefono_temp"};
        return(cols);
    }
    
    public String[] getSqlRows()
    {
        //Fila
        String[] rows = 
        {
            "" + 0,
            "'" + fecha_temp + "'",
            "'" + cedula_temp + "'",
            "'" + areacedula_temp + "'",
            "'" + nombre_temp + "'",
            "'" + apellido_temp + "'",
            "'" + sexo_temp + "'",
            "'" + fecha_nacimiento_temp + "'",
            "'" + lugar_nacimiento_temp + "'",
            "'" + tipo_paciente_temp + "'",
            "'" + direccion_temp + "'",
            "'" + correo_temp + "'",
            "'" + areacorreo_temp + "'",
            "'" + areatelefono_temp + "'",
            "'" + telefono_temp + "'",
            "'" + estado_civil_temp + "'",
            "'" + grado_instrucion_temp + "'",
            "'" + profesion_temp + "'",
            "'" + ocupacion_temp + "'",
            "'" + coct_nombre_temp+ "'",
            "'" + coct_apellido_temp + "'",
            "'" + coct_cedula_temp + "'",
            "'" + coct_areacedula_temp + "'",
            "'" + coct_parentesco_temp + "'",
            "'" + coct_areatelefono_temp + "'",
            "'" + coct_telefono_temp + "'"
        };
        return(rows);
    }//Fin getSqlRows
    
    public String getSqlTable()
    {
        return("Paciente_Temp");
    }
    
    // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_temp() {
        return fecha_temp;
    }

    public void setFecha_temp(String fecha_temp) {
        this.fecha_temp = fecha_temp;
    }

    public String getCedula_temp() {
        return cedula_temp;
    }

    public void setCedula_temp(String cedula_temp) {
        this.cedula_temp = cedula_temp;
    }

    public String getAreacedula_temp() {
        return areacedula_temp;
    }

    public void setAreacedula_temp(String areacedula_temp) {
        this.areacedula_temp = areacedula_temp;
    }

    public String getNombre_temp() {
        return nombre_temp;
    }

    public void setNombre_temp(String nombre_temp) {
        this.nombre_temp = nombre_temp;
    }

    public String getApellido_temp() {
        return apellido_temp;
    }

    public void setApellido_temp(String apellido_temp) {
        this.apellido_temp = apellido_temp;
    }

    public String getSexo_temp() {
        return sexo_temp;
    }

    public void setSexo_temp(String sexo_temp) {
        this.sexo_temp = sexo_temp;
    }

    public String getFecha_nacimiento_temp() {
        return fecha_nacimiento_temp;
    }

    public void setFecha_nacimiento_temp(String fecha_nacimiento_temp) {
        this.fecha_nacimiento_temp = fecha_nacimiento_temp;
    }

    public String getLugar_nacimiento_temp() {
        return lugar_nacimiento_temp;
    }

    public void setLugar_nacimiento_temp(String lugar_nacimiento_temp) {
        this.lugar_nacimiento_temp = lugar_nacimiento_temp;
    }

    public String getTipo_paciente_temp() {
        return tipo_paciente_temp;
    }

    public void setTipo_paciente_temp(String tipo_paciente_temp) {
        this.tipo_paciente_temp = tipo_paciente_temp;
    }

    public String getDireccion_temp() {
        return direccion_temp;
    }

    public void setDireccion_temp(String direccion_temp) {
        this.direccion_temp = direccion_temp;
    }

    public String getCorreo_temp() {
        return correo_temp;
    }

    public void setCorreo_temp(String correo_temp) {
        this.correo_temp = correo_temp;
    }

    public String getAreacorreo_temp() {
        return areacorreo_temp;
    }

    public void setAreacorreo_temp(String areacorreo_temp) {
        this.areacorreo_temp = areacorreo_temp;
    }

    public String getTelefono_temp() {
        return telefono_temp;
    }

    public void setTelefono_temp(String telefono_temp) {
        this.telefono_temp = telefono_temp;
    }

    public String getAreatelefono_temp() {
        return areatelefono_temp;
    }

    public void setAreatelefono_temp(String areatelefono_temp) {
        this.areatelefono_temp = areatelefono_temp;
    }

    public String getEstado_civil_temp() {
        return estado_civil_temp;
    }

    public void setEstado_civil_temp(String estado_civil_temp) {
        this.estado_civil_temp = estado_civil_temp;
    }

    public String getGrado_instrucion_temp() {
        return grado_instrucion_temp;
    }

    public void setGrado_instrucion_temp(String grado_instrucion_temp) {
        this.grado_instrucion_temp = grado_instrucion_temp;
    }

    public String getProfesion_temp() {
        return profesion_temp;
    }

    public void setProfesion_temp(String profesion_temp) {
        this.profesion_temp = profesion_temp;
    }

    public String getOcupacion_temp() {
        return ocupacion_temp;
    }

    public void setOcupacion_temp(String ocupacion_temp) {
        this.ocupacion_temp = ocupacion_temp;
    }

    public String getCoct_nombre_temp() {
        return coct_nombre_temp;
    }

    public void setCoct_nombre_temp(String coct_nombre_temp) {
        this.coct_nombre_temp = coct_nombre_temp;
    }

    public String getCoct_apellido_temp() {
        return coct_apellido_temp;
    }

    public void setCoct_apellido_temp(String coct_apellido_temp) {
        this.coct_apellido_temp = coct_apellido_temp;
    }

    public String getCoct_cedula_temp() {
        return coct_cedula_temp;
    }

    public void setCoct_cedula_temp(String coct_cedula_temp) {
        this.coct_cedula_temp = coct_cedula_temp;
    }

    public String getCoct_areacedula_temp() {
        return coct_areacedula_temp;
    }

    public void setCoct_areacedula_temp(String coct_areacedula_temp) {
        this.coct_areacedula_temp = coct_areacedula_temp;
    }

    public String getCoct_parentesco_temp() {
        return coct_parentesco_temp;
    }

    public void setCoct_parentesco_temp(String coct_parentesco_temp) {
        this.coct_parentesco_temp = coct_parentesco_temp;
    }

    public String getCoct_telefono_temp() {
        return coct_telefono_temp;
    }

    public void setCoct_telefono_temp(String coct_telefono_temp) {
        this.coct_telefono_temp = coct_telefono_temp;
    }

    public String getCoct_areatelefono_temp() {
        return coct_areatelefono_temp;
    }

    public void setCoct_areatelefono_temp(String coct_areatelefono_temp) {
        this.coct_areatelefono_temp = coct_areatelefono_temp;
    }
    
}
