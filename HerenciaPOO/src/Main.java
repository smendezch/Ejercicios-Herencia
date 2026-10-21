import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1: Animal y Gato ---");
        Gato gato = new Gato();
        gato.hacerSonido();

        System.out.println("\n--- Ejercicio 2: Figuras ---");
        Rectangulo rectangulo = new Rectangulo(5, 3);
        Circulo circulo = new Circulo(2);
        System.out.printf(Locale.US, "Rectángulo: área = %.2f, perímetro = %.2f%n",
                rectangulo.calcularArea(), rectangulo.calcularPerimetro());
        System.out.printf(Locale.US, "Círculo: área = %.2f, perímetro = %.2f%n",
                circulo.calcularArea(), circulo.calcularPerimetro());

        System.out.println("\n--- Ejercicio 3: Empleados ---");
        Empleado empleado = new Empleado("Ana", "Soto Vargas", "Programadora");
        EmpleadoRH encargadoRH = new EmpleadoRH("Luis", "Mora Rojas", "Encargado de RH");
        encargadoRH.contratarEmpleado(empleado);
        empleado.trabajar();
        System.out.printf(Locale.US, "Salario mensual: $%.2f%n", empleado.calcularSalario());

        System.out.println("\n--- Ejercicio 4: Cuenta de ahorros ---");
        CuentaAhorros cuenta = new CuentaAhorros(200);
        cuenta.depositar(50);
        System.out.printf(Locale.US, "Saldo después de depositar $50: $%.2f%n", cuenta.getSaldo());
        boolean retiroRealizado = cuenta.retirar(200);
        System.out.println("Retiro de $200: " + (retiroRealizado
                ? "realizado" : "rechazado, el saldo quedaría por debajo de $100"));
        System.out.printf(Locale.US, "Saldo final: $%.2f%n", cuenta.getSaldo());
    }
}
