
package tallerreparaciondecelulares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cliente {

    //ATRIBUTOS
   
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    private String domicilio;
    private String telefono;
    private String email;
    
    
    // LISTA DE LOS CLIENTES
    public static List<Cliente> clientes = new ArrayList<>();
    
    // CONTRUCTOR

    public Cliente(int id, String nombre, String apellido, String dni, 
                   String domicilio, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        clientes.add(this); // Agrega el cliente a la lista
    }
    

    // METODO PARA AGREGAR CLIENTE
  
   public static Cliente agregarCliente(Scanner entrada) {
        System.out.print("ID: ");
        int id = entrada.nextInt();
        entrada.nextLine(); // Limpieza del buffer

        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("DNI: ");
        String dni = entrada.nextLine();

        System.out.print("Domicilio: ");
        String domicilio = entrada.nextLine();

        System.out.print("Teléfono: ");
        String telefono = entrada.nextLine();

        System.out.print("Email: ");
        String email = entrada.nextLine();

        // CREA AL CLIENTE CON LOS DATOS INGRESADOS
        Cliente nuevoCliente = new Cliente(id, nombre, apellido, dni, domicilio, telefono, email);
        System.out.println(" " );
        System.out.println("-------------------------" );
        System.out.println("Cliente agregado con éxito:\n" + nuevoCliente);
        return nuevoCliente; // Retorna la instancia del cliente
    }


    public static Cliente buscarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.id == id) {
                return cliente;
            }
        }
        return null; // RETORNA NULL SI NO ENCUENTRA
    }

    // METODO PARA EDITAR CLIENTE CON MENU
    public static void editarCliente(int id) {
        Cliente cliente = buscarClientePorId(id);
        
        if (cliente != null) {
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("DATOS ACTUALES DEL CLIENTE:");
            System.out.println(cliente);
            
            int opcion;
            do {
                System.out.println("SELECCIONE QUE DATOS DEL CLIENTE DESEA EDITAR:");
                System.out.println("1. Nombre");
                System.out.println("2. Apellido");
                System.out.println("3. DNI");
                System.out.println("4. Domicilio");
                System.out.println("5. Teléfono");
                System.out.println("6. Email");
                System.out.println("7. Salir");
                System.out.print("Opción: ");
                
                opcion = entrada.nextInt();
                entrada.nextLine(); // Limpia el scanner entrada
                
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nuevo nombre: ");
                        cliente.setNombre(entrada.nextLine());
                        break;
                        
                    case 2:
                        System.out.print("Ingrese el nuevo apellido: ");
                        cliente.setApellido(entrada.nextLine());
                        break;
                        
                    case 3:
                        System.out.print("Ingrese el nuevo DNI: ");
                        cliente.setDni(entrada.nextLine());
                        break;
                        
                    case 4:
                        System.out.print("Ingrese el nuevo domicilio: ");
                        cliente.setDomicilio(entrada.nextLine());
                        break;
                        
                    case 5:
                        System.out.print("Ingrese el nuevo teléfono: ");
                        cliente.setTelefono(entrada.nextLine());
                        break;
                        
                    case 6:
                        System.out.print("Ingrese el nuevo email: ");
                        cliente.setEmail(entrada.nextLine());
                        break;
                        
                    case 7:
                        System.out.println("SALIENDO.");
                        break;
                        
                    default:
                        System.out.println("SELECCIONÓ UNA OPCIÓN INVALIDA. INTENTE NUEVAMENTE.");
                }
            } while (opcion != 7);
            
            System.out.println("************************");
            System.out.println("");
            System.out.println("EL CLIENTE FUE EDITADO CON ÉXITO.");
            System.out.println("");
            System.out.println("DATOS ACTUALIZADOS DEL CLIENTE:");
            System.out.println(cliente); // Mostrar los datos actualizados del cliente
            System.out.println("");
            System.out.println("************************");
        } else {
            System.out.println("NO SE ENCONTRO EL CLIENTE.");
        }
    }

    // METODO PARA ELIMINAR CLIENTE
    public static void eliminarCliente(int id) {
        Cliente cliente = buscarClientePorId(id);
       
        if (cliente != null) {
            clientes.remove(cliente);
             System.out.println("************************");
            System.out.println("");
            System.out.println("CLIENTE ELIMINADO CON EXITO");
        } else {
            System.out.println("CLIENTE NO ENCONTRADO");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
    

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(List<Cliente> clientes) {
        Cliente.clientes = clientes;
    }
    
    

    @Override
    public String toString() {
        return "Cliente {" +
                "\nID: " + id +
                " \nNombre: " + nombre +
                " \nApellido: " + apellido + 
                " \nDNI: " + dni + "\n" +
                " \nDomicilio: " + domicilio + 
                " \nTeléfono: " + telefono + 
                " \nEmail: " + email + 
                "\n ";
    }
    
          
    }
    
    
    
    

