public class Coordinador extends Persona {
    private String departamentoACargo;

    public Coordinador(String nombre, int ID, String nivelDeAcceso, String horaEntrada, String horaSalida, String departamentoACargo) {
        super(nombre, ID, nivelDeAcceso, horaEntrada, horaSalida);
        this.departamentoACargo = departamentoACargo;
    }

    public String getDepartamentoACargo() {
        return departamentoACargo;
    }

    public void supervisarDepartamento() {
        System.out.println(getNombre() + " está supervisando el departamento de " + departamentoACargo + ".");
    }
}
