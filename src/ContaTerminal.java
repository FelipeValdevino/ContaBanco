import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Olá, qual seu nome? " );
        nomeCliente = entrada.nextLine();

        System.out.println("Digite seu numero: ");
        numero = entrada.nextInt();

        System.out.println("Digite a sua agencia: ");
        agencia = entrada.nextLine();
        
        System.out.println("Digite seu saldo: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "conta " + numero + " e seu saldo " + saldo + " Ja estar disponivel para saque!");



    }
}
