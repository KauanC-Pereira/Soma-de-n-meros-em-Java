import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double soma = 0;
        
        System.out.print("Digite a quantidade de números que deseja somar: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += input.nextDouble();
        }
        
        System.out.println("A soma dos " + n + " números é: " + soma);
        input.close();
    }
}