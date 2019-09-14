package felizanonovo;

import java.util.Scanner;

public class FelizAnoNovo {

    public static void main(String[] args) {

        //Declaração do Scanner
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite um numero para iniciar a contagem: ");
        contagem(teclado.nextInt());

    }

    public static void contagem(int numero) {

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }

}
