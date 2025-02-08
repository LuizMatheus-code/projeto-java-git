import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        sc.close();

        System.out.println("Olá, " + nome + "!");
        System.out.println("As médias das notas " + nota1 + " e " + nota2 + " fica " + media);
    }
}
