import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o numero da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.print("Por favor, digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já está disponível para saque", nome, agencia, conta, saldo);


    }
}
