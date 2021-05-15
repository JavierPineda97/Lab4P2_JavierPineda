
package gbx;

import gbx.GBX.Trabajadores;


public class Consultores extends Trabajadores{
    private int CantidadProyectosRealizados;
    private int TiempoContrato;
    private String PrinCampoExperiencia;
    private int TiempoDuracionConsulta;
    
    public Consultores (String nombre, String apellido, int ID, String nacionalidad, int CantidadProyectosRealizados, int TiempoContrato,
            String PrinCampoExperiencia, int TiempoDuracionConsulta){
        
        super(nombre,apellido, ID, nacionalidad);
        
        this.CantidadProyectosRealizados=CantidadProyectosRealizados;
        this.TiempoContrato=TiempoContrato;
        this.PrinCampoExperiencia=PrinCampoExperiencia;
        this.TiempoDuracionConsulta=TiempoDuracionConsulta;
    }

    public int getCantidadProyectosRealizados() {
        return CantidadProyectosRealizados;
    }

    public int getTiempoContrato() {
        return TiempoContrato;
    }

    public String getPrinCampoExperiencia() {
        return PrinCampoExperiencia;
    }

    public int getTiempoDuracionConsulta() {
        return TiempoDuracionConsulta;
    }
    
    @Override
    public String mostrarDatos(){
        return "Nombre:"+getNombre()+"\nApellido:"+getApellido()+"\nID:"+getID()+"\nNacionalidad"+getNacionalidad()
        +"\nCantidad de proyectos realizados:"+CantidadProyectosRealizados+"\nTiempo de contrato"+TiempoContrato+
        "\nPrincipal campo de experiencia:"+PrinCampoExperiencia+"\nTiempo de duracion de consulta:"+TiempoDuracionConsulta;
    }
}
