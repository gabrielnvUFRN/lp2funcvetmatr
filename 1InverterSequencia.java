import java.util.Scanner;

public class InverterSequencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int N = scanner.nextInt();

        int[] vetor = new int[N];

        System.out.println("Digite os números da sequência:");
        for (int i = 0; i < N; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Sequência invertida:");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
