import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos para un empleado
        System.out.println("Registro de Empleado:");
        System.out.print("Nombre: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("ID: ");
        int idEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nivel de acceso: ");
        String nivelAccesoEmpleado = scanner.nextLine();
        System.out.print("Hora de entrada: ");
        String horaEntradaEmpleado = scanner.nextLine();
        System.out.print("Hora de salida: ");
        String horaSalidaEmpleado = scanner.nextLine();
        Empleado empleado = new Empleado(nombreEmpleado, idEmpleado, nivelAccesoEmpleado, horaEntradaEmpleado, horaSalidaEmpleado);

        // Solicitar datos para un cliente
        System.out.println("\nRegistro de Cliente:");
        System.out.print("Nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("ID: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nivel de acceso: ");
        String nivelAccesoCliente = scanner.nextLine();
        System.out.print("Hora de entrada: ");
        String horaEntradaCliente = scanner.nextLine();
        System.out.print("Hora de salida: ");
        String horaSalidaCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nombreCliente, idCliente, nivelAccesoCliente, horaEntradaCliente, horaSalidaCliente);

        // Solicitar datos para un jefe
        System.out.println("\nRegistro de Jefe:");
        System.out.print("Nombre: ");
        String nombreJefe = scanner.nextLine();
        System.out.print("ID: ");
        int idJefe = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nivel de acceso: ");
        String nivelAccesoJefe = scanner.nextLine();
        System.out.print("Hora de entrada: ");
        String horaEntradaJefe = scanner.nextLine();
        System.out.print("Hora de salida: ");
        String horaSalidaJefe = scanner.nextLine();
        Jefe jefe = new Jefe(nombreJefe, idJefe, nivelAccesoJefe, horaEntradaJefe, horaSalidaJefe);

        // Solicitar datos para un coordinador
        System.out.println("\nRegistro de Coordinador:");
        System.out.print("Nombre: ");
        String nombreCoordinador = scanner.nextLine();
        System.out.print("ID: ");
        int idCoordinador = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nivel de acceso: ");
        String nivelAccesoCoordinador = scanner.nextLine();
        System.out.print("Hora de entrada: ");
        String horaEntradaCoordinador = scanner.nextLine();
        System.out.print("Hora de salida: ");
        String horaSalidaCoordinador = scanner.nextLine();
        System.out.print("Departamento a cargo: ");
        String departamentoACargo = scanner.nextLine();
        Coordinador coordinador = new Coordinador(nombreCoordinador, idCoordinador, nivelAccesoCoordinador, horaEntradaCoordinador, horaSalidaCoordinador, departamentoACargo);

        // Mostrar información
        System.out.println("\nInformación registrada:");
        System.out.println(empleado.generarReporteTiempo());
        empleado.atenderClientes();

        System.out.println(cliente.generarReporteTiempo());
        cliente.reportarProblema();

        System.out.println(jefe.generarReporteTiempo());
        jefe.registrarDatosEmpleados();

        System.out.println(coordinador.generarReporteTiempo());
        coordinador.supervisarDepartamento();

        scanner.close();
    }
}
