import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpleadoRH extends Empleado {
    private final List<Empleado> empleadosContratados = new ArrayList<>();

    public EmpleadoRH(String nombre, String apellidos, String puesto) {
        super(nombre, apellidos, puesto);
    }

    public void contratarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo.");
        }
        empleadosContratados.add(empleado);
        System.out.println(getNombre() + " contrató a " + empleado.getNombre()
                + " " + empleado.getApellidos() + " para el puesto de " + empleado.getPuesto() + ".");
    }

    public List<Empleado> getEmpleadosContratados() {
        return Collections.unmodifiableList(empleadosContratados);
    }
}
