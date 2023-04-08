import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        int numero_1,numero_2;
        float numero_3,total_a,total_b,total_c;
           
    Scanner reader = new Scanner(System.in);
        System.out.print("Digite um número: ");
            numero_1 = reader.nextInt();
        System.out.print("Digite um número: ");
            numero_2 = reader.nextInt();
        System.out.print("Digite um número: ");
            numero_3 = reader.nextFloat();

        total_a = (numero_1 * 2) + numero_2 / 2;
        System.out.println("O resultado da questão 'A' é: " + total_a);
        total_b = (numero_1 * 3) + numero_3;
        System.out.println("O resultado da questão 'B' é: " + total_b);
        total_c = (numero_3 *numero_3 * numero_3);
        System.out.println("O resultado da questão 'C' é: " + total_c);
    }
}
