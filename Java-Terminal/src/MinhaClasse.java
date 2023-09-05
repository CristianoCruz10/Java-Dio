import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args){
// Criando um Scanner

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome:" );
    String sobrenome = scanner.next();    

    System.out.println("Digite a sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Digite a sua altura: ");
    double altura = scanner.nextDouble();

//imprimindo os dados do usuário
        System.out.println("Seu nome é: " + nome + sobrenome);
        System.out.println("Tenho : " + idade + " Cranos");
        System.out.println("Minha altura é: " + altura);

        scanner.close();
    
    }
}