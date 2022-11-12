import java.io.Console;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá Seja Bem Vindo");
        Scanner scan = new Scanner(System.in);
        String cliente;
        String numeroAgencia;
        int numeroConta;
        double saldo;

        System.out.println("Digite seu nome");
        cliente = scan.next();
        System.out.println("Digite o numero da Conta");
        numeroConta = scan.nextInt();
        System.out.println("Digite o numero da Agência");
        numeroAgencia = scan.next();
        System.out.println("Digite o Saldo a ser depositado");
        saldo = scan.nextDouble();
       
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", conta " +numeroConta+ " e seu saldo " + saldo + " já está disponível para saque");
    }
}
