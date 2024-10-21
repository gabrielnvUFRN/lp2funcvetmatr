import java.util.Scanner;

public class TrianguloPascal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas do Triângulo de Pascal: ");
        int n = scanner.nextInt();

        int[][] pascal = new int[n][n];

        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1;  
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
