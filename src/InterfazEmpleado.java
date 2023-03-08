import java.util.Scanner;

public class InterfazEmpleado {

    public static void InterfazEmp() {
        PasarelaAuthentificacion autentificacion = new PasarelaAuthentificacion();
        Empleado empleado = (Empleado) autentificacion.autentificar();
        int sel1;
        Scanner sc = new Scanner(System.in);
        GestorClientes gestorClientes = new GestorClientes();

        System.out.println("1. Gestionar clientes");
        System.out.println("2. Gestionar empleados");
        System.out.println("3. Gestionar productos");
        System.out.println("4. Gestionar stock");
        System.out.println("5. Gestionar pedidos");
        System.out.print("Introduce una opción: ");
        sel1 = sc.nextInt();

        switch (sel1){
            case 1:
                System.out.println("Gestionar clientes");
                System.out.println("==================");
                System.out.println("\n\n\n");
                System.out.println("1. Añadir cliente");
                System.out.println("2. Eliminar cliente");
                System.out.println("3. Modificar cliente");
                System.out.println("4. Mostrar clientes");
                System.out.println("5. Volver");
                System.out.print("Introduce una opción: ");
                sel1 = sc.nextInt();
                switch (sel1) {
                    case 1:
                        System.out.println("Añadir cliente");
                        System.out.println("==============");
                        System.out.println("\n\n\n");
                        System.out.println("Nombre: ");
                        String nombreNuevo = sc.nextLine();
                        System.out.println("Apellidos: ");
                        String apellidosNuevo = sc.nextLine();
                        System.out.println("DNI: ");
                        String dniNuevo = sc.nextLine();
                        System.out.println("Dirección: ");
                        String direccionNuevo = sc.nextLine();
                        System.out.println("Teléfono: ");
                        String telefonoNuevo = sc.nextLine();
                        System.out.println("Email: ");
                        String emailNuevo = sc.nextLine();
                        System.out.println("Usuario: ");
                        String usuarioNuevo = sc.nextLine();
                        System.out.println("Contraseña: ");
                        String contraseñaNuevo = sc.nextLine();
                        Cliente clienteNuevo = new Cliente(nombreNuevo, apellidosNuevo, dniNuevo, direccionNuevo, telefonoNuevo, emailNuevo, usuarioNuevo, contraseñaNuevo);
                        gestorClientes.addCliente(clienteNuevo);
                        System.out.println("Cliente añadido correctamente\n\n\n");
                        break;
                    case 2:
                        System.out.println("Eliminar cliente");
                        System.out.println("================");
                        System.out.println("\n\n\n");
                        System.out.println("DNI: ");
                        String dniEliminar = sc.nextLine();
                        Cliente clienteEliminar = gestorClientes.obtenerCliente(dniEliminar);
                        gestorClientes.removeCliente(clienteEliminar);
                        System.out.println("Cliente eliminado correctamente\n\n\n");
                        break;
                    case 3:
                        System.out.println("Modificar cliente");
                        System.out.println("=================");
                        System.out.println("\n\n\n");
                        System.out.println("DNI: ");
                        String dniModificar = sc.nextLine();
                        Cliente clienteModificar = gestorClientes.obtenerCliente(dniModificar);
                        System.out.println("Datos del cliente a modificar: ");
                        System.out.println("Nombre: " + clienteModificar.getNombre());
                        System.out.println("Apellidos: " + clienteModificar.getApellidos());
                        System.out.println("DNI: " + clienteModificar.getDni());
                        System.out.println("Dirección: " + clienteModificar.getDireccion());
                        System.out.println("Teléfono: " + clienteModificar.getTelefono());
                        System.out.println("Email: " + clienteModificar.getEmail());
                        System.out.println("Usuario: " + clienteModificar.getUsuario());
                        System.out.println("Contraseña: " + clienteModificar.getContraseña());
                        System.out.println("¿Desea modificar los datos del cliente? (S/N)");
                        String respuesta = sc.nextLine();
                        if (respuesta.equals("S")) {
                            System.out.println("Nombre: ");
                            String nombre = sc.nextLine();
                            System.out.println("Apellidos: ");
                            String apellidos = sc.nextLine();
                            System.out.println("DNI: ");
                            String dni = sc.nextLine();
                            System.out.println("Dirección: ");
                            String direccion = sc.nextLine();
                            System.out.println("Teléfono: ");
                            String telefono = sc.nextLine();
                            System.out.println("Email: ");
                            String email = sc.nextLine();
                            System.out.println("Usuario: ");
                            String usuario = sc.nextLine();
                            System.out.println("Contraseña: ");
                            String contraseña = sc.nextLine();
                            Cliente cliente = new Cliente(nombre, apellidos, dni, direccion, telefono, email, usuario, contraseña);
                            gestorClientes.removeCliente(clienteModificar);
                            gestorClientes.addCliente(cliente);
                            System.out.println("Cliente modificado correctamente\n\n\n");
                        } else {
                            System.out.println("Operación cancelada\n\n\n");
                        }
                        break;
                    case 4:
                        System.out.println("Mostrar clientes");
                        System.out.println("================");
                        System.out.println("\n\n\n");
                        gestorClientes.obtenerClientes();
                        break;
                    case 5:
                        System.out.println("Volver");
                        System.out.println("======");
                        //Codigo para volver al menu principal
                        System.out.println("\n\n\n");
                        break;

                    default:
                        System.out.println("Opción incorrecta");
                        System.out.println("=================");
                        System.out.println("\n\n\n");
                        break;
                }
                break;

            case 2:
                System.out.println("Gestionar empleados");
                System.out.println("===================");
                if(empleado.getPrivilegios() == true){

                }
                else {
                    System.out.println("No tienes privilegios para acceder a esta opción");
                    System.out.println("===============================================");
                    System.out.println("\n\n\n");
                }
                System.out.println("\n\n\n");


        }

    }
}
