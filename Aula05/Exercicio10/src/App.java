//Nome: Nicolas Ribeiro
//1222010390
//Caixa Eletronico com while, switch/case e if/else
//Saldo inicial: 1000,00, deverá ter menu de operações: 1 - Depositar, 2 - Sacar, 3 - Consultar saldo, 0 Sair. O programa deve continuar rodando até que o usuário escolha a opção de sair (0). 

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("== Caixa Eletrônico ==");

        double saldo = 1000.00;
        int operacao = -1;
        Scanner entrada = new Scanner(System.in);
        while(operacao != 0){
            System.out.print("1 - Depositar");
            System.out.print(" 2 - Sacar");
            System.out.print(" 3 - Consultar saldo");
            System.out.println(" 0 - Sair");
            System.out.print("Escolha: ");
            operacao = entrada.nextInt();
        
        switch(operacao){
            case 1:
                System.out.println("Valor do depósito: ");
                saldo += entrada.nextDouble();
                System.out.printf("Depósito realizado. Novo saldo: R$%.2f%n", saldo);
                break;
            case 2:
                System.out.println("Valor do saque: ");
                double valorSaque = entrada.nextDouble();
                if (valorSaque > saldo) {
                    System.out.printf("Saldo insuficiente! Saldo disponivel: R$%.2f%n", saldo);
                } else {
                    saldo -= valorSaque;
                }
                break;
            case 3:
                System.out.printf("Saldo: R$%.2f%n", saldo);
                break;
            case 0:
                System.out.println("Até logo!");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        }
    }
}
