import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();

        System.out.println("Digite a primeira nota");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = entrada.nextDouble();

        entrada.close();

        System.out.println("Olá, " + nome + "!");
    }
}
