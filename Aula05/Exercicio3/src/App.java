//nome: Nicolas Ribeiro Alves
//Matricula: 1222010390
//Calculadora com switch case
//Usar double, switch com break em cada case, e um default para caso o usuario digite uma operacao invalida.
//Para divisao verificar se o divisor é zero antes de calcular.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado;
        char operacao;
        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextDouble();
        System.out.print("Digite o segundo numero: ");
        numero2 = entrada.nextDouble();
        System.out.print("Digite a operacao (+, -, *, /): ");
        operacao = entrada.next().charAt(0);

        switch(operacao){
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if(numero2  == 0){
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operacao invalida. Por favor, digite uma operacao valida.");

        }
    }
}
