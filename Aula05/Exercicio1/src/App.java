//Nome: Nicolas Ribeiro Alves Rocha
//Matrícula: 1222010390
//Par ou Ímpar

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número inteiro: ");

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.print(numero + " é par.");
        } else {
            System.out.print(numero + " é ímpar.");
        }
    }
}
