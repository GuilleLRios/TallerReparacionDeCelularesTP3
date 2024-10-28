
package tallerreparaciondecelulares;

import java.util.Scanner;


public class Trabajador extends Usuario{
    
    //ATRIBUTO ESPECIALIDAD PARA LA CLASE TRABAJADOR 
    
    private String especialidad;
      
     //CONTRUCTOR 
     
    public Trabajador(String nombre, String apellido, String especialidad) {
        super(nombre, apellido, null, null); // El usuario y contraseña no se utilizan para Trabajador
        this.especialidad = especialidad;
    }
    
    //METODO PARA AGREGAR TRABAJADOR
    
    public static Trabajador agregarTrabajador(Scanner entrada) {
        System.out.println("\nAGREGAR QUE TRABAJADOR SERA ASIGNADO A LA REPARACION");

        
        System.out.print("Ingrese el Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el Apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese la Especialidad: ");
        String especialidad = entrada.nextLine();

        // CREAR Y RETONAR EL NUEVO TRABAJADOR
        return new Trabajador(nombre, apellido, especialidad);
    }

    
    //GETTER AND SETTER

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //METODO TOSTRING

    @Override
   public String toString() {
        return  "\n"+ "encargado de la reparacion"+
                "Nombre: " + getNombre() + "\n" +
                " Apellido: " + getApellido() + "\n" +
                " Especialidad: " + especialidad + "\n" +
                "";

    
            
    

    

   }
   }
