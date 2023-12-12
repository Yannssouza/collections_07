import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        String cor;
        ArrayList<String> array = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite cinco cores:");
        for (int i = 0; i < 5; i++) {
            cor = leia.nextLine();
            array.add(cor);
        }

        leia.close();

        System.out.println("Listar todas as cores:");
        System.out.println(array);

        Collections.sort(array);
        System.out.println("Ordenar as cores:");
        System.out.println(array);
    }

}
