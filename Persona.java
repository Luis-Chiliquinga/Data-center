public class Persona {
    public String nombre;
    public int ID;
    public String nivelDeAcceso;
    public String horaEntrada;
    public String horaSalida;

    public Persona(String nombre, int ID, String nivelDeAcceso, String horaEntrada, String horaSalida) {
        this.nombre = nombre;
        this.ID = ID;
        this.nivelDeAcceso = nivelDeAcceso;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public String getNivelDeAcceso() {
        return nivelDeAcceso;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    // Método para generar un reporte de tiempo en el Data Center
    public String generarReporteTiempo() {
        return nombre + " ha registrado entrada a las " + horaEntrada + " y salida a las " + horaSalida;
    }
}
