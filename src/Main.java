import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        Integer Numero = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite a agência: ");
        String Agencia = scan.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String Nome_Cliente = scan.nextLine();
        System.out.print("Digite o saldo: ");
        Double Saldo = scan.nextDouble();

        ContaTerminal conta = new ContaTerminal(Numero, Agencia, Nome_Cliente, Saldo);

        System.out.println("ola " + conta.Nome_Cliente + " sua conta é " + conta.Numero + " da agência " + conta.Agencia + " e seu saldo é R$" + conta.Saldo);

    }
}