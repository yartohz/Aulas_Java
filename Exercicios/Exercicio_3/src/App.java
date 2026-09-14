import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int op = 0;
        while (op != 7) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potência");
            System.out.println("6 - Resto da divisão");
            System.out.println("7 - Sair");
            op = scan.nextInt();
            if (op>= 1 && op <= 6) {
                System.out.println("Digite o primeiro número:");
                double num1 = scan.nextDouble();
                System.out.println("Digite o segundo número:");
                double num2 = scan.nextDouble();
                double resultado = 0;
                switch (op) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Não é possível dividir por zero.");
                            continue;
                        }
                        break;
                    case 5:
                        resultado = Math.pow(num1, num2);
                        break;
                    case 6:
                        if (num2 != 0) {
                            resultado = num1 % num2;
                        } else {
                            System.out.println("Não é possível calcular o resto da divisão por zero.");
                            continue;
                        }
                        break;
                }
                System.out.println("O resultado é: " + resultado);
            } 
            else if (op != 7) {
                System.out.println("Fechando o programa.");
                
            }
        }
        scan.close();
    }
}
