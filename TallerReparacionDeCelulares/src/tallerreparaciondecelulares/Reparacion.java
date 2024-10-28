
package tallerreparaciondecelulares;

import java.util.Date;
import java.util.Scanner;

public class Reparacion {
    
    //Atributos para esta clase reparacion
    //Atributo de composicion celular
    
    
    private String descripcion;
    private double costo;
    private Date fechaIngreso;
    private Date fechaEntrega;
    
    //CONTRUCTOR

    public Reparacion(String descripcion, double costo, Date fechaIngreso) {
       
        this.descripcion = descripcion;
        this.costo = costo;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = null;
    }
    
    // METODO PARA AGREGAR UNA NUEVA REPARACION
    
    public static Reparacion agregarReparacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------------------------- ");
        System.out.println(" ");
        System.out.println("AGREGAR NUEVA REPARACIÓN");
        
        System.out.print("Descripción de la reparación: ");
        String descripcion = entrada.nextLine();
        
        System.out.print("Costo de la reparación: (ingrese valor numerico)");
        double costo = entrada.nextDouble();
        
        // ESTABLECE LA FECHA ACTUAL
        Date fechaIngreso = new Date();
        
        // CREA Y RETORNA 
        return new Reparacion(descripcion, costo, fechaIngreso);
    }
    //GETTER AND SETTER


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    //METODO TOSTRING 

    @Override
    public String toString() {
        return "\n"
                +"\n Reparacion" + "\n descripcion : " 
                + descripcion + "\n costo : " 
                + costo + "\n fechaIngreso : " 
                + fechaIngreso + "\n fechaEntrega : "
                + fechaEntrega + '}';
    }
    
    
    
    
    
            
}
