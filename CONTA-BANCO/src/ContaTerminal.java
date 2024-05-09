import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nmCliente = scanner.next();

        System.out.print("Digite o usuário: ");
        int usuario = scanner.nextInt();

        System.out.print("Digite a Agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        System.out.print("Digite o valor solicitado para saque: ");
        double valorSolicitado = scanner.nextDouble();

        System.out.println("Olá " + nmCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + usuario + " e seu saldo " + String.format("%.2f", saldo)
                + " já está disponível para saque.");

        if (saldo >= valorSolicitado) {

            saldo = (float) (saldo - valorSolicitado);
            System.out.println("Saque realizado com sucesso. Novo saldo: " + String.format("%.2f", saldo));
        } else {

            System.out.println("Saldo insuficiente. Não é possível realizar o saque.");
        }

        System.out.println("Valor do saldo é " + String.format("%.2f", saldo) + ".");

        scanner.close();
    }

}
