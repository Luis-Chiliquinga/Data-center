public class Jefe extends Persona {
    public Jefe(String nombre, int ID, String nivelDeAcceso, String horaEntrada, String horaSalida) {
        super(nombre, ID, nivelDeAcceso, horaEntrada, horaSalida);
    }

    public void nivelDeAutorizacion() {
        System.out.println(getNombre() + " tiene un alto nivel de autorización.");
    }

    private void registrarDatosEmpleados() {
        System.out.println(getNombre() + " está registrando los datos de los empleados.");
    }
}
