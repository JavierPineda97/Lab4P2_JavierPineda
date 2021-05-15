package gbx;

import java.util.ArrayList;
import java.util.Scanner;


public class GBX {
   public class Trabajadores{
        protected String nombre;
        protected String apellido;
        protected int ID;
        protected String nacionalidad;
        
        public Trabajadores(String nombre, String apellido, int ID, String nacionalidad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.ID = ID;
            this.nacionalidad = nacionalidad; 
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

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
        }
        
        public String mostarDatos(){
            return "Nombre:"+nombre+"\nApellido:"+apellido+"\nID:"+ID+"\nNacionalidad:"+nacionalidad;
        }
   }

    
    public static void main(String[] args) {
        //MENU
        char operacion;
        int campo;
        String password;
        String usuario;
        
        System.out.println("Bienvenido!");
        System.out.println("Seleccione su campo:\n");
        
        System.out.println("Campos:");
        System.out.println("1.Desarrolladores");
        System.out.println("2.Consultores:");
        System.out.println("3.Directores:");
        System.out.println("4.admin:\n");
        
        System.out.println("Campo:");
        
        Scanner teclado=new Scanner (System.in);
        
        campo=teclado.nextInt();
        
        
        if(campo==1){
            System.out.println("Ingrese su password");
            System.out.println("Password:");
            password=teclado.next();
            
            System.out.println("Bienvenido al menu de desarrollador!");
            System.out.println("Que operacion desea realizar?|\n");
            
            System.out.println("Operaciones:");
            System.out.println("1.Ver informacion del proyecto");
            System.out.println("2.Eliminar cuenta");
            System.out.println("3.Ver cantidad de proyectos asignados");
            System.out.println("4.Ver descripcion de proyectos");
            System.out.println("6.Salir");
        }else{
            if(campo==2){
            System.out.println("Ingrese su password");
            System.out.println("Password:");
            password=teclado.next();
            
            System.out.println("Bienvenido al menu de consultor!");
            System.out.println("Que operacion desea realizar?|\n");
            
            System.out.println("Operaciones:");
            System.out.println("1.Ver informacion del proyecto");
            System.out.println("2.Modificar proyecto");
            System.out.println("3.Eliminar cuenta");
            System.out.println("4.Ver cantidad de proyectos asignados");
            System.out.println("5.Ver descripcion de proyectos");
            System.out.println("6.Salir");
            }else{
                if(campo==3){
                    System.out.println("Ingrese su password");
                    System.out.println("Password:");
                    password=teclado.next();
                    
                    System.out.println("Bienvenido al menu de director!");
                    System.out.println("Que operacion desea realizar?|\n");
                    
                    System.out.println("Operaciones:");
                    System.out.println("1.Crear proyecto");
                    System.out.println("2.Modificar proyecto");
                    System.out.println("3.Eliminar a un consultor o desarrolador");
                    System.out.println("4.Ver proyectos asignados");
                    System.out.println("5.Ver proyectos en el sistema");
                    System.out.println("6.Finalizar proyecto");
                    System.out.println("7.Salir");    
                }else{
                    if(campo==4){
                        System.out.println("Ingrese su nombre de usuario:");
                        usuario=teclado.next();
                        
                        System.out.println("Ingrese su password:");
                        password=teclado.next();
                        
                        if(usuario=="admin" && password=="1234"){
                            System.out.println("Bienvenido al menu de administrador:");
                            System.out.println("Que operacion desea realizar?\n");
                            
                            System.out.println("Operaciones:");
                            System.out.println("1.Crear proyecto");
                            System.out.println("2.Modificar proyecto");
                            System.out.println("3.Eliminar a un consultor o desarrolador");
                            System.out.println("4.Ver proyectos asignados");
                            System.out.println("5.Ver proyectos en el sistema");
                            System.out.println("6.Finalizar proyecto");
                            System.out.println("7.Salir");    
                    }
                }
            }
        }
         
    }
    Trabajadores trabajador[]=new Trabajadores [20];
    
    trabajador[0]= new Trabajadores ("Jose","Lopez","0801-2000-06615");
    trabajador[1] = new Desarrolladores()
    }
}
