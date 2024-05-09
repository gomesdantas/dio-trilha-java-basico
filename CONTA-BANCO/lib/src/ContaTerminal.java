import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

      
        System.out.print("Digite o valor solicitado para saque: ");
        double valorSolicitado = scanner.nextDouble();
    
            if (saldo >= valorSolicitado) {
           
                saldo = saldo - valorSolicitado;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            } else {
              
                System.out.println("Saldo insuficiente. Não é possível realizar o saque.");
            }
            System.out.println("Valor do saldo é " + saldo);
            
            scanner.close();
    }
    
}
