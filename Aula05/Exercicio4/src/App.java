//Nome: Nicolas Ribeiro Alves
//Matricula: 1222010390
//Contador de 1 até N

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o valor de N: ");
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        if (N > 0) {
            int contador = 1;
            while (contador <= N) {
                System.out.println(contador);
                contador++;
            }
            System.out.println("Contagem concluída.");
        } else {
            System.out.println("Valor inválido. Não deve ser maior que zero.");
            }
        }
    }

