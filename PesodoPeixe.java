import java.util.Scanner;

public class PesodoPeixe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de multa - Pescado");
        System.out.println();
        while (true) {
            System.out.println("insira o peso dos pescados: ");
            int P = sc.nextInt();

            if (P == 0) {
                System.out.println("fim!");
                break;
            } else if (P > 50) {
                int E = P - 50;
                int M = E * 4;
                System.out.printf("O valor da multa é R$ %d\n", M);
                System.out.printf("O exesso peso %d\n", E);
            } else {
                System.out.println("O valor da multa e do exesso é 0!");
            }
        }

    }
}
