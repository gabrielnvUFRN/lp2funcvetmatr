import java.util.Scanner;

public class TorreXadrez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] tabuleiro = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        System.out.println("Movimentos de uma Torre no xadrez!");
        System.out.print("Digite a linha em que a Torre se encontra (1-8): ");
        int linhaTorre = scanner.nextInt() - 1;  
        System.out.print("Digite a coluna em que a Torre se encontra (1-8): ");
        int colunaTorre = scanner.nextInt() - 1;  

        for (int i = 0; i < 8; i++) {
            tabuleiro[linhaTorre][i] = 'X'; 
            tabuleiro[i][colunaTorre] = 'X';  
        }

        System.out.println("\nMovimentos possíveis:");
        System.out.println("\n   1  2  3  4  5  6  7  8");
        System.out.println("  ------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiro[i][j] + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
