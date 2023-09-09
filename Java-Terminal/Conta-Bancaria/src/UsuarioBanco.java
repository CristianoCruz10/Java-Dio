import java.util.Locale;
import java.util.Scanner;

public class UsuarioBanco {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o numero da sua agencia bancaria: ");
    int agencia = scanner.nextInt();

    System.out.println("Digite o numero da sua conta bancaria: ");
    int conta = scanner.nextInt();

    System.out.println("Bem Vindo a sua conta bancaria");

    ContaTerminal minhaConta = new ContaTerminal(agencia, conta);

    System.out.println("Digite o valor que deseja depositar: ");
    double depositar = scanner.nextDouble();

    minhaConta.depositar(depositar);
    minhaConta.mostrarSaldo();

    System.out.println("Digite o valor que deseja sacar: ");
    double sacarValor = scanner.nextDouble();
    minhaConta.sacar(sacarValor);
    minhaConta.mostrarSaldo();

    System.out.println("Digite 1 para consultar seu extrato");
    double extrato = scanner.nextDouble();
    minhaConta.extrato();
   

     scanner.close();
        
    }
}
