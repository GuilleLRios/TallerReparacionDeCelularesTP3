package tallerreparaciondecelulares;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TallerReparacionDeCelulares{
    public static void main(String[] args) {
       int opcion;
        Scanner entrada = new Scanner(System.in);

        // SOLICITA DATOS AL USUARIO
        Usuario usuario = Usuario.solicitarDatosUsuario(entrada);
        System.out.println("***********************************");
        System.out.println("BIENVENIDO AL SISTEMA " + usuario);

        do {
            System.out.println("");
            System.out.println("=== MENU ===");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Editar Cliente");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Salir");

            // MANEJO DE ERRORES EN EL MENU
            while (true) {
                try {
                    System.out.print("Seleccione una opción: ");
                    opcion = entrada.nextInt();
                    entrada.nextLine();
                    break; 
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                    entrada.nextLine(); 
                }
            }

            switch (opcion) {
                case 1:
                    // AGREGAR CLIENTE
                    Cliente nuevoCliente = Cliente.agregarCliente(entrada);
                    
                    // AGREGAR CELULAR
                    Celular nuevoCelular = Celular.agregarCelular(entrada);
                    
                    // AGREGAR INFORMACION DE LA REPARACION
                    Reparacion nuevaReparacion = Reparacion.agregarReparacion();
                    nuevoCelular.agregarReparacion(nuevaReparacion); // Asegúrate de que este método exista

                    // AGREGAR TRABAJADOR
                    Trabajador nuevoTrabajador = Trabajador.agregarTrabajador(entrada);

                    // SOLICITA NUMERO DE ORDEN
                    int numOrden;
                    while (true) {
                        try {
                            System.out.print("Ingrese el número de orden: ");
                            numOrden = entrada.nextInt();
                            entrada.nextLine(); 
                            break; 
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, ingrese un número válido.");
                            entrada.nextLine(); 
                        }
                    }
                    
                    // CREA UNA NUEVA ORDEN
                    Orden nuevaOrden = new Orden(numOrden, nuevoCliente, nuevoCelular, nuevoTrabajador);
                    nuevaOrden.agregarReparacion(nuevaReparacion); 

                    // MMOSTRARA LA INFORMACION DE LA ORDEN
                    System.out.println("\n*******************************");
                    System.out.println("\nORDEN CREADA CON ÉXITO:");
                    System.out.println(nuevaOrden);
                    System.out.println(" ");
                    System.out.println("GRACIAS POR UTILIZAR TALLER REPARACION DE CELULARES");
                    break;

                case 2:
                    // EDITAR EL CLIENTE
                    int idEditar;
                    while (true) {
                        try {
                            System.out.print("Ingrese el ID del cliente a editar: ");
                            idEditar = entrada.nextInt();
                            entrada.nextLine(); 
                            Cliente.editarCliente(idEditar);
                            break; 
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, ingrese un número válido.");
                            entrada.nextLine(); 
                        }
                    }
                    break;

                case 3:
                    // ELIMINA UN CLIENTE
                    int idEliminar;
                    while (true) {
                        try {
                            System.out.print("Ingrese el ID del cliente a eliminar: ");
                            idEliminar = entrada.nextInt();
                            entrada.nextLine(); 
                            Cliente.eliminarCliente(idEliminar);
                            break; 
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, ingrese un número válido.");
                            entrada.nextLine(); 
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println(); 
        } while (opcion != 4);
System.out.println("GRACIAS POR UTILIZAR TALLER REPARACION DE CELULARES");
        entrada.close(); // CIERRA EL SCANNER
    }
}
    


     


