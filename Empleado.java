public class Empleado extends Persona {
    public Empleado(String nombre, int ID, String nivelDeAcceso, String horaEntrada, String horaSalida) {
        super(nombre, ID, nivelDeAcceso, horaEntrada, horaSalida);
    }

    public void atenderClientes() {
        System.out.println(getNombre() + " está atendiendo a un cliente.");
    }

    private void resolverProblemas() {
        System.out.println(getNombre() + " está resolviendo problemas.");
    }
}
