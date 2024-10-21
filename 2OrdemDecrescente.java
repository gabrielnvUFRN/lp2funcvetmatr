import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numeros = new Integer[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}
