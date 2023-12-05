import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String nome = scanner.next();

        System.out.println("Digite o valor a ser depositado!");
        double saldo = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuário
        System.out.println("Ola, " + nome + ", " + "obrigado por criar uma conta em nosso banco. Sua Agência é: "+agencia+", conta: "+ numero + ", e seu Saldo " + saldo + " já está disponível para saque." );
    }
}
