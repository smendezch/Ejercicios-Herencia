public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        if (!Double.isFinite(saldoInicial) || saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial debe ser finito y no negativo.");
        }
        saldo = saldoInicial;
    }

    public double getSaldo() { return saldo; }

    protected void validarMonto(double monto) {
        if (!Double.isFinite(monto) || monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo y finito.");
        }
    }

    public void depositar(double monto) {
        validarMonto(monto);
        if (!Double.isFinite(saldo + monto)) {
            throw new IllegalArgumentException("El depósito excede el saldo permitido.");
        }
        saldo += monto;
    }

    public boolean retirar(double monto) {
        validarMonto(monto);
        if (monto > saldo) { return false; }
        saldo -= monto;
        return true;
    }
}
