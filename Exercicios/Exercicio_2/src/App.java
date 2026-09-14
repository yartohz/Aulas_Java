import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        byte dia = scan.nextByte();
        byte mês = scan.nextByte();
        int ano = scan.nextInt();

        System.out.println("Digite o dia: " + dia);
        System.out.println("Digite o mês: " + mês);
        System.out.println("Digite o ano: " + ano);

        if (dia >= 1 && dia <= 31 && mês >= 1 && mês <= 12 && ano >= 1960) {
            System.out.println("A data é válida.");
        } 
        
        else if (dia < 1 || dia > 31) {
            System.out.println("O dia é inválido.");
        } 
        
        else if (mês < 1 || mês > 12) {
            System.out.println("O mês é inválido.");
        } 
        
        else if (ano < 1960) {
            System.out.println("O ano é inválido.");
        } 
        
        else if ((mês == 4 || mês == 6 || mês == 9 || mês == 11) && dia > 30) {
            System.out.println("O dia é inválido para o mês informado.");
        } 
        
        else if (mês == 2 && dia > 29) {
            System.out.println("O dia é inválido para o mês de fevereiro.");
        } 
        
        else if (mês == 2 && dia == 29 && (ano % 4 != 0 || (ano % 100 == 0 && ano % 400 != 0))) {
            System.out.println("O ano informado não é bissexto, portanto o dia é inválido para o mês de fevereiro.");
        }
        
        else {
            System.out.println("A data é inválida.");
        }

        scan.close();
    }
    
}
