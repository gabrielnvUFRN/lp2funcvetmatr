import java.util.Scanner;

public class SomaAbaixoDiagonalPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos abaixo da diagonal principal: " + soma);

        scanner.close();
    }
}