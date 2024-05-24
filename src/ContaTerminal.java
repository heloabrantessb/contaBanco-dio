import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero_conta;
        String agencia, nome_cliente;
        double saldo;

        System.out.println("Por favor informe seu nome");
        nome_cliente = teclado.next();

        System.out.println("Digite sua agência");
        agencia = teclado.next();

        System.out.println("Digite o número de sua conta");
        numero_conta = teclado.nextInt();

        System.out.println("Informe seu saldo");
        saldo = teclado.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta + "e seu saldo " + saldo + "já está disponível para saque.");

        teclado.close();
    }
}
