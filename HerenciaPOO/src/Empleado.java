public class Empleado {
    public static final int HorasTrabajadasDia = 8;
    public static final double PagoHora = 10.0;
    public static final int DiasTrabajadosSemana = 5;
    public static final int SemanasMes = 4;

    private final String nombre;
    private final String apellidos;
    private final String puesto;

    public Empleado(String nombre, String apellidos, String puesto) {
        if (nombre == null || nombre.trim().isEmpty()
                || apellidos == null || apellidos.trim().isEmpty()
                || puesto == null || puesto.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre, apellidos y puesto son obligatorios.");
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getPuesto() { return puesto; }
    public void trabajar() {
        System.out.println(nombre + " " + apellidos + " trabaja como " + puesto + ".");
    }
    public double calcularSalario() {
        return HorasTrabajadasDia * PagoHora * DiasTrabajadosSemana * SemanasMes;
    }
}
