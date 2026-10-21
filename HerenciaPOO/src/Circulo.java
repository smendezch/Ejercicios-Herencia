public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        if (!Double.isFinite(radio) || radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser positivo y finito.");
        }
        this.radio = radio;
    }

    public double getRadio() { return radio; }
    @Override
    public double calcularArea() { return Math.PI * radio * radio; }
    @Override
    public double calcularPerimetro() { return 2 * Math.PI * radio; }
}
