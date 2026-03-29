//Nome: Nicolas Ribeiro 
//Matricula: 1222010390
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite cada lado do triangulo: ");
        
        int ladoA = entrada.nextInt();
        int ladoB = entrada.nextInt();
        int ladoC = entrada.nextInt();

        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("O triangulo é equilatero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
            System.out.println("O triangulo é isosceles");
        } else {
            System.out.println("O triangulo é escaleno");
        }
    }
}
