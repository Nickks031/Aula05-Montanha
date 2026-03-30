//Nome: Nicolas Ribeiro
//Matricula: 1222010390
//Menu de Conversor de Unidades, deve se repetir até que o usuario escolha a opção 0 - Sair
//Usar somente while e switch/case

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("== Conversor de Unidades ==");
        int opcao = -1;
        
        Scanner entrada = new Scanner(System.in);
        while (opcao != 0) {
            System.out.print(" 1 - Quilômetros para Milhas");
            System.out.print(" 2 - Celsius para Fahrenheit");
            System.out.print(" 3 - Quilogramas para Libras");
            System.out.println(" 0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite a distância em quilômetros: ");
                    double km = entrada.nextDouble();
                    double milhas = km * 0.0621371;
                    System.out.println(km + " km = " + milhas + " milhas");
                case 2:
                    System.out.println("Digite a temperatura em Celsius: ");
                    double celsius = entrada.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + "°C = " + fahrenheit + "°F");
                case 3:
                    System.out.println("Digite o peso em quilogramas: ");
                    double quilogramas = entrada.nextDouble();
                    double libras = quilogramas * 2.20462;
                    System.out.println(quilogramas + " kg = " + libras + " lb");
                case 0:
                    System.out.println("Encerrando. Até logo!");
            }
        }
    }
}
