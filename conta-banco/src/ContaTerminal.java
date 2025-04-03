import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();  // inserir número da conta
        scanner.nextLine();  

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();  // inserir agência

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();  // inserir nome do cliente

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();  // inserir saldo

        // Exibe a mensagem final
        System.out.println("Olá " + nomeCliente + 
                           ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                           ", conta " + numero + " e seu saldo " + saldo + 
                           " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}