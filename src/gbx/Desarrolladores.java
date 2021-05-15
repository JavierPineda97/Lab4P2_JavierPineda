
package gbx;

import gbx.GBX.Trabajadores;
       
public class Desarrolladores extends Trabajadores {
   private int ProyectosRealizados;
   private int experiencia;
   private int TiempoContrato;
   private String LenguaPrograFavorito;
   private int HorasTrabajoDiarias;
   private int SueldoMensual=0;            
    
    public Desarrolladores (String nombre, String apellido, int ID, String nacionalidad, int ProyectosRealizados, int experiencia, int TiempoContrato,
            String LenguaPrograFavorito, int HorasTrabajoDiarias, int SueldoMensual){
        
        super(nombre, apellido, ID, nacionalidad);
        
        this.ProyectosRealizados=ProyectosRealizados;
        this.experiencia=experiencia;
        this.TiempoContrato=TiempoContrato;
        this.LenguaPrograFavorito=LenguaPrograFavorito;
        this.HorasTrabajoDiarias=HorasTrabajoDiarias;
        this.SueldoMensual=SueldoMensual;
    }

    public int getProyectosRealizados() {
        return ProyectosRealizados;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getTiempoContrato() {
        return TiempoContrato;
    }

    public String getLenguaPrograFavorito() {
        return LenguaPrograFavorito;
    }

    public int getHorasTrabajoDiarias() {
        return HorasTrabajoDiarias;
    }

    public int getSueldoMensual() {
        return SueldoMensual;
    }
    
    @Override
    public String mostrarDatos(){
        return "Nombre:"+nombre+"\nApellido:"+apellido+"\nID:"+ID+"\nNacionalidad:"+nacionalidad+"\nProyectos realizados:"+ProyectosRealizados
                +"\nExperiencia:"+experiencia+"\nTiempo de contraro:"+TiempoContrato+"\nLenguaje de programacion favorito:"+LenguaPrograFavorito
                +"\nHoras diarias trabajadas:"+HorasTrabajoDiarias+"\nSueldo mensual:"+SueldoMensual;
    }
}
    

