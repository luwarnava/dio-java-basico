import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Utilizando scanner
       Scanner scanner = new Scanner(System.in);

       System.out.print("Nome da agencia: ");
       String agencia = scanner.nextLine();
       
       System.out.print("Digite seu nome: ");
       String nomeUsuario = scanner.nextLine();

       System.out.print("Digite o número da sua conta: ");
       int numeroConta = scanner.nextInt();

       System.out.print("Insira o valor do seu saldo: ");
       double saldoUsuario = scanner.nextDouble();


       
       System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "
       + numeroConta + " e seu saldo " + saldoUsuario + " já está disponível para saque.");

       scanner.close();

    }
}
