//Nome: Nicolas Ribeiro Alves  
//Matricula: 1222010390
//Validação de nota com Conceito.
// Use while (nota < 0 || nota > 100) para a validação. Após o laço, use if/else if/else para classificar

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a nota (0 a 100):");
        int nota = entrada.nextInt();

        while (nota <0 || nota  >100){
            System.out.println("Nota inválida! Digite novamente.");
            System.out.print("Digite a nota (0 a 100):");
            nota = entrada.nextInt();
        }

        if (nota >= 90) {
            System.out.println("Conceito: A");
        } else if (nota >= 75 && nota < 90) {
            System.out.println("Conceito: B");
        } else if(nota >=60 && nota < 75){
            System.out.println("Conceito: C");
        }else if(nota < 60){
            System.out.println("D (reprovado)");
        }
    }
}
