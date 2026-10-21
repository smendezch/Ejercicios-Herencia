public class CuentaAhorros extends Cuenta {
    public static final double SALDO_MINIMO = 100.0;

    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
        if (saldoInicial < SALDO_MINIMO) {
            throw new IllegalArgumentException("La cuenta de ahorros requiere al menos $100.");
        }
    }

    @Override
    public boolean retirar(double monto) {
        validarMonto(monto);
        if (getSaldo() - monto < SALDO_MINIMO) { return false; }
        return super.retirar(monto);
    }
}
