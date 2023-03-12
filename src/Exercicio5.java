import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        sc.close();

        boolean primo = true;

        if (num < 2) {
            primo = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(num + " é um número primo");
        } else {
            System.out.println(num + " não é um número primo");
        }
    }
}
