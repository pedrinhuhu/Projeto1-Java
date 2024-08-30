import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variaveis
        String nome = "Pedro Verly";
        String tipoDeConta = "Corrente";
        double saldo = 2500;
        int opcaoEscolhida = 0;


        //Informações do cilente
        System.out.println("****************************");
        System.out.println("Dados do cliente:");
        System.out.println("\nNome:  " + nome);
        System.out.println("Conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("****************************");

        //Menu do cliente
        String menu = """
                Operações;
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;
        //Escolher opção
        Scanner leitura = new Scanner(System.in);
        System.out.println("\nDigite a opção desejada:");

        while (opcaoEscolhida != 4) {
            System.out.println(menu);
            opcaoEscolhida = leitura.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Seu saldo é de: " + saldo);
        } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor recebido:");
                double valorRecebido = leitura.nextDouble();
                 saldo = saldo + valorRecebido;
                System.out.println("O saldo agora é de: " + saldo);
            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o valor a tranferir:");
                double valorTransferido = leitura.nextDouble();
                if (saldo < valorTransferido) {
                    System.out.println("Impossivel tranferir, saldo insuficiente.");
                } else {
                    saldo = saldo - valorTransferido;
                    System.out.println("O saldo agora é de: " + saldo);
                }
            } else if (opcaoEscolhida != 4) {
                System.out.println("Opção inválida");
                
            }
        }

    }
}