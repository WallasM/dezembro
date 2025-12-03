import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite uma frase");
        String frase = sc.nextLine();
        int cont = 1;

        while (cont <= 1000) {

            System.out.print(frase);
            cont = cont + 1;

        }
        System.out.println("curupado");
    sc.close();
    }
}
