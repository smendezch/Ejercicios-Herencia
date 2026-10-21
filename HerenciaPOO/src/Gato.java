public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        super.hacerSonido(); // Ejecuta primero la lógica de la clase madre.
        System.out.println("El gato maúlla: ¡Miau!");
    }
}
