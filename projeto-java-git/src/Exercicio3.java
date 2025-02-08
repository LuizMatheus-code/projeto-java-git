import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Crsitiane");
        nomes.add("Jany");
        nomes.add("Luiz");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
