import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        var numberaccount = sc.nextInt();
        System.out.println("Por favor, digite o numero da agencia: ");
        var agency = sc.next();
        System.out.println("Por favor, digite o seu nome: ");
        var name = sc.next();
        System.out.println("Por favor, digite o seu saldo atual: ");
        var cash = sc.nextFloat();
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua Agencia e %s conta %s e seu saldo %s ja esta disponivel para saque.",name,agency,numberaccount,cash);
         sc.close(); 
    }
}
