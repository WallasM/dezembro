import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voce acaba de entrar na calculadeira mais top do brasil");
        System.out.println();
        int cont = 1;
        while (cont < 3) {
            System.out.print("insira o primeiro numero: ");
            System.out.println();
            int num1 = sc.nextInt();
            System.out.print("insira o segundo numero: ");
            System.out.println();
            int num2 = sc.nextInt();
            int soma = num1 + num2;
            System.out.printf("soma: %d\n", soma);
            int sub = num1 - num2;
            System.out.printf("subitração: %d\n", sub);
            int mult = num1 * num2;
            System.out.printf("multiplicação: %d\n", mult);
            cont = cont + 1;
        }
        sc.close();
    }
}