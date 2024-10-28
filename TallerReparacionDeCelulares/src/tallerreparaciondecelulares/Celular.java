
package tallerreparaciondecelulares;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Celular {
    
    // Atributos MARCA, MODELO, IMEI para esta clase celular
    private String marca;
    private String modelo;
    private String imei;
    private List<Reparacion> reparaciones;
    
    // CONSTRUCTOR
    public Celular(String marca, String modelo, String imei) {
        this.marca = marca;
        this.modelo = modelo;
        this.imei = imei;
        this.reparaciones = new ArrayList<>();
    }
    
    // METODO PARA AGREGAR CELULAR
    public static Celular agregarCelular(Scanner entrada) {
        System.out.println("\nAGREGAR NUEVO CELULAR PARA EL CLIENTE");

        
        System.out.print("Ingrese la Marca: ");
        String marca = entrada.nextLine();

        System.out.print("Ingrese el Modelo: ");
        String modelo = entrada.nextLine();
        
        System.out.print("Ingrese el IMEI: ");
        String imei = entrada.nextLine();

        // METODO PARA CREAR UN NUEVO CELULAR
        Celular celular = new Celular(marca, modelo, imei);
        System.out.println(" ");
        System.out.println("CELULAR AGREGADO CON ÉXITO:\n" + celular);
        return celular;
    }
     
    // METODO PARA AGREGAR REPARACION
    public void agregarReparacion(Reparacion reparacion) {
        reparaciones.add(reparacion);
        System.out.println("Reparación agregada al celular: " + reparacion);
    }

    // GETTER AND SETTER
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public List<Reparacion> getReparaciones() {
        return reparaciones;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return "\n"
                +"Celular"+"\n"
                +"IMEI: " + imei + "\n"
                +"Marca: " 
                + marca  + "\n" +
                "Modelo='" + modelo + "\n" +
                " ";
    }
}
