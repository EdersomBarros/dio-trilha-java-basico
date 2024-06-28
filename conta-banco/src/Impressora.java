public class Impressora implements Imprimir {

    private Conta conta;

    public Impressora(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void imprimirMensagem() {
        String mensagem = "Olá " + conta.getCliente().getNome()
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgencia().getCodigo() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo()
                + " já está disponível para saque.";
        System.out.println(mensagem);
    }

}
