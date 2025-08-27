import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        String numeroStr = scanner.nextLine().trim();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine().trim();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine().trim();

        System.out.print("Por favor, digite o saldo inicial: ");
        String saldoStr = scanner.nextLine().trim();

        // Convertendo entradas
        int numero = Integer.parseInt(numeroStr);
        double saldo = Double.parseDouble(saldoStr.replace(",", ".")); // aceita 237,48 ou 237.48

        // Formata em Real (R$ 0,00)
        NumberFormat moedaBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String saldoFormatado = moedaBR.format(saldo);

        // Mensagem final (com concatenação simples)
        String mensagem = "Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldoFormatado
                + " já está disponível para saque.";

        System.out.println();
        System.out.println(mensagem);

        scanner.close();
    }
}

