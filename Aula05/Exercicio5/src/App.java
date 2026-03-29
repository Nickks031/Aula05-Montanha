//Nome: Nicolas Ribeiro
//Matricula: 1222010390
// Use while (numero != 0). Declare a variável numero com um valor diferente de zero antes do laço para a condição ser avaliada corretamente na primeira vez.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Digite números inteiros para somar. (Digite 0 para encerrar).");
        int numero = entrada.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma += numero;
            System.out.println("Digite outro número (ou 0 para encerrar):");
            numero = entrada.nextInt();
        }

        System.out.println("A soma total dos números digitados é: " + soma);
        entrada.close();
    }
}
