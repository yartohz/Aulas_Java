import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        int frequencia = scan.nextInt();  
        
        System.out.println("Digite a primeira nota: " + nota1);
        System.out.println("Digite a segunda nota: " + nota2);
        System.out.println("Digite a terceira nota: " + nota3);
        System.out.println("A média é: " + media);
        System.out.println("A frequência é: " + frequencia);

        if (media >= 7.0 && frequencia >= 75) {
            System.out.println("O aluno foi aprovado.");
        }
        else if (media >= 5.0 && media <= 6.99 && frequencia >= 75) {
            System.out.println("O aluno está de recuperação.");
        }
        
        else if (media >= 7.0 && frequencia < 75) {
            System.out.println("O aluno está reprovado por falta.");
        }

        else if (media < 5.0 && frequencia >= 75) {
            System.out.println("O aluno está reprovado por nota.");
        }

        else {
            System.out.println("O aluno foi reprovado.");
        }
        scan.close();
    }
}
