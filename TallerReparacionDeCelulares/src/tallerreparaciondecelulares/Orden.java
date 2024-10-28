
package tallerreparaciondecelulares;

import java.util.ArrayList;

import java.util.List;


public class Orden {
    
     // NUM DE ORDEN
    private int numOrden;
    
    // CLIENTE
    private Cliente cliente;
    
    // CELULAR DEL CLIENTE
    private Celular celular;
    
    // TRABAJADOR QUE REPARA
    private Trabajador trabajador;
    
    // LISTA DE LAS REPARACIONES
    private List<Reparacion> reparaciones;

    // CONTRUCTOR
    public Orden(int numOrden, Cliente cliente, Celular celular, Trabajador trabajador) {
        this.numOrden = numOrden;
        this.cliente = cliente;
        this.celular = celular;
        this.trabajador = trabajador;
        this.reparaciones = new ArrayList<>();
    }

    // GETTER AND SETTER
    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public List<Reparacion> getReparaciones() {
        return reparaciones;
    }

    public void setReparaciones(List<Reparacion> reparaciones) {
        this.reparaciones = reparaciones;
    }

    // Agrega una nueva reparación a la lista
    public void agregarReparacion(Reparacion reparacion) {
        reparaciones.add(reparacion);  
    }
    
    // Método toString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{")
          .append("numOrden=").append(numOrden).append("\n")
          .append(", cliente=").append(cliente.toString()).append("\n")
          .append(", celular=").append(celular.toString()).append("\n")
          .append(", trabajador=").append(trabajador.toString()).append("\n")
          .append(", reparaciones=").append(reparaciones)
          .append('}');
        return sb.toString(); 
    }
}
