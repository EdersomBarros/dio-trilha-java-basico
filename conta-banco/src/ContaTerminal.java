import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:CONHECER E IMPORTAR A CLASSE SCANNER
        Scanner sc = new Scanner(System.in);


        //TODO:Exibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        //Criar uma nova agencia
        System.out.print("Por favor, digite o código da Agencia: ");
        String codigoAgencia = sc.nextLine();
        Agencia agencia = new Agencia(codigoAgencia);

        //Criar uma nova conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor, digite o saldo inicial: ");
        String saldoInput = sc.nextLine();
        double saldoInicial = Double.parseDouble(saldoInput.replace(',', '.'));

        ContaBanco conta = new ContaBanco(numeroConta, agencia, cliente, saldoInicial);

        //obter na classe scanner os valores digitados no terminal

        //exibir a mensagem da conta criada
        Impressora imprimirMsg = new Impressora(conta);
        imprimirMsg.imprimirMensagem();


        
        //Fecha o scanner
        sc.close();



    }
}
