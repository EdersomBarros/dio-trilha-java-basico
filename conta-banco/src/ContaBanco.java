public class ContaBanco implements Conta {

    private int numero;
    private Agencia agencia;
    private Cliente cliente;
    private double saldo;

    public ContaBanco(int numero, Agencia agencia, Cliente cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    @Override
    public void setNumero(int numero) {

        this.numero = numero;
        throw new UnsupportedOperationException("Unimplemented method 'setNumero'");
    }

    @Override
    public int getNumero() {
        return numero;

    }

    @Override
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;

        throw new UnsupportedOperationException("Unimplemented method 'setAgencia'");
    }

    @Override
    public Agencia getAgencia() {
        return agencia;
    }

    @Override
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        throw new UnsupportedOperationException("Unimplemented method 'setCliente'");
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
        throw new UnsupportedOperationException("Unimplemented method 'setSaldo'");
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
