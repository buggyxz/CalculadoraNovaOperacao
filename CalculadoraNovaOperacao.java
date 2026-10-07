import java.util.Scanner;
public class CalculadoraNovaOperacao { 

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String repetir;

    do {
        double numero1, numero2;
        int operacao;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Escolha a operacao: ");
        operacao = scanner.nextInt();
        
        switch (operacao) {
        
            case 1:
            System.out.println("O resultado para está operação é: " + (numero1 + numero2));
        break;
        
            case 2:
            System.out.println("O resultado para está operação é: " + (numero1 - numero2));
        break;
        
            case 3:
            System.out.println("O resultado para está operação é: " + (numero1 * numero2));
        break;
        
            case 4:
            if (numero2 == 0) {
            System.out.println("Erro! Divisao por zero não é permitida!");

        } else {
        
            System.out.println("O resultado para está operação é: " + (numero1 / numero2));
        }
        break;
        
        default:
        System.out.println("Está operação é Invalida!");
    }
    
    System.out.print("Você deseja realizar outra operação? (S/N)? ");
    repetir = scanner.next();
    
    } while     (repetir.equalsIgnoreCase("S"));
        System.out.println("Calculadora encerrada.");

    scanner.close();
    }
}