import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    private int agencia;
    private int conta;
    private double saldo;
    private double extrato;


    public ContaTerminal(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0; // saldo da conta, se inicia com zero
        this.extrato = 0; // Inicializa o extrato com zero
    }

    public void extrato() {
        System.out.println("O saldo da sua conta é: " + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato += valor; // Adiciona o valor ao extrato
            System.out.println("Depósito de R$ " + valor + " Realizado com sucesso.");
        } else {
            System.out.println("Valor depositado inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("O saldo da conta " + agencia + " / " + conta + ": R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Deseja realizar um saque de R$" + valor + " ? (sim ou não): ");
            String resposta = scanner.nextLine().toLowerCase(); // ler a resposta do usuário e converter para minúsculas

            if (resposta.equals("sim")) {
                if (valor <= saldo) {
                    saldo -= valor;
                    extrato -= valor; // Subtrai o valor do extrato
                    System.out.println("Saque de R$" + valor + " Realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque!");
                }
            } else if (resposta.equals("não")) {
                System.out.println("Saque cancelado.");
            } else {
                System.out.println("Resposta inválida. Nenhum saque foi realizado.");
            }
        } else {
            System.out.println("Valor do saque inválido!");
        }
    
    }
}
