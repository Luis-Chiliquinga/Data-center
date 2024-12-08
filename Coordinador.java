public class Coordinador extends Persona {
    public String departamentoACargo;

    public Coordinador(String nombre, int ID, String nivelDeAcceso, String horaEntrada, String horaSalida, String departamentoACargo) {
        super(nombre, ID, nivelDeAcceso, horaEntrada, horaSalida);
        this.departamentoACargo = departamentoACargo;
    }

    public String getDepartamentoACargo() {
        return departamentoACargo;
    }

}
