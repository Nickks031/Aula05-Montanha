//Nome: Nicolas Ribeiro Alves
//Matricula: 1222010390
//Tabuada, lendo um numero N e exibindo a tabuada de 1 a 10 do numero N, usando N x multiplicador = resultado.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int N = entrada.nextInt();
        int contador = 1;

        while (contador <= 10) {
           int resultado = N * contador;
           System.out.println(N + " x " + contador + " = " + resultado);
            contador++;
        }
        entrada.close();
    }
}
