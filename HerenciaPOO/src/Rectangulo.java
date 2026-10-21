public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        if (!Double.isFinite(base) || !Double.isFinite(altura) || base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser positivas y finitas.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }
    @Override
    public double calcularArea() { return base * altura; }
    @Override
    public double calcularPerimetro() { return 2 * (base + altura); }
}
