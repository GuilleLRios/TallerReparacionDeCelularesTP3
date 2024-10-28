
package tallerreparaciondecelulares;

import java.util.Scanner;


public class Usuario {
    
  
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    
    //CONTRUCTOR

    public Usuario(String nombre, String apellido, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    //GETTER AND SETTER
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    // METODOS PARA SOLICITAR DATOS AL USUARIO
    public static Usuario solicitarDatosUsuario(Scanner entrada) {
       
        System.out.println("------INGRESE SUS DATOS DE USUARIO ------");
         

        System.out.print("Ingrese su Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su Apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su Usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Ingrese su Contraseña: ");
        String contrasenia = entrada.nextLine();

        // Crear y devolver el objeto Usuario
        return new Usuario(nombre, apellido, usuario, contrasenia);
    }

    //METODO TOSTRING

    @Override
    public String toString() {
        return "Usuario- " + "nombre: " + nombre + 
                ", apellido: " + apellido 
                + ", usuario: " + usuario 
                + ", contrasenia: " + contrasenia + '}';
    }
    
    
    
    
    
}
