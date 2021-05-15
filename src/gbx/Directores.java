
package gbx;

import gbx.GBX.Trabajadores;

public class Directores extends Trabajadores{
    private int TiempoPuesto;
    private int TiempoContrato;
    private String DesarrolladoresAsignados;
    private int CantidadProyectosRealizados;
    private int SueldoMensual=0;
    
    public Directores(String nombre, String apellido, int ID, String nacionalidad, int TiempoPuesto, int TiempoContrato,
            String DesarrolladoresAsignados, int CantidadProyectosRealizados, int SueldoMensual){
        
            super(nombre, apellido, ID, nacionalidad);
            
            this.TiempoPuesto=TiempoPuesto;
            this.TiempoContrato=TiempoContrato;
            this.DesarrolladoresAsignados=DesarrolladoresAsignados;
            this.CantidadProyectosRealizados=CantidadProyectosRealizados;
            this.SueldoMensual=SueldoMensual;
    }

    public int getTiempoPuesto() {
        return TiempoPuesto;
    }

    public int getTiempoContrato() {
        return TiempoContrato;
    }

    public String getDesarrolladoresAsignados() {
        return DesarrolladoresAsignados;
    }

    public int getCantidadProyectosRealizados() {
        return CantidadProyectosRealizados;
    }

    public int getSueldoMensual() {
        return SueldoMensual;
    }
    
   @Override 
    public String mostrarDatos(){
        return "Nombre:"+getNombre()+"\nApellido:"+getApellido()+"\nID:"+getID()+"\nNacionalidad"+getNacionalidad()
        +"\nTiempo en el puesto:"+TiempoPuesto+"\nTiempo de contrato"+TiempoContrato+"\nDesarrolladores asignados:"+DesarrolladoresAsignados+
         "\nCantidad de proyectos realizados:"+CantidadProyectosRealizados+"\nSueldo mensual:"+SueldoMensual;
    }
    
}
