import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;
        
        System.out.println("Por favor, digite o número da Agência");
        Agencia = scanner.next();
        System.out.println("Por favor, digite o número da sua Conta");
        Numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu Nome");
        NomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o Saldo da sua Conta");
        Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + 
            ", conta " + Numero + 
            " e seu saldo " + Saldo + " já está disponível para saque");
    }
}
