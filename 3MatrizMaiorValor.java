import java.util.Scanner;

public class MatrizMaiorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int maiorValor = Integer.MIN_VALUE;
        int linhaMaior = 0;
        int colunaMaior = 0;

        System.out.println("Digite os valores para preencher a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();

                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Matriz preenchida:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Posição: Linha " + (linhaMaior + 1) + ", Coluna " + (colunaMaior + 1));

        scanner.close();
    }
}
