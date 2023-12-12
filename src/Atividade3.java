import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3 {

    public static void main(String[] args) {
        int numero;
        Set<Integer> setNumeros = new HashSet<>();

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 numeros inteiros não repetidos:");
        for (int i = 0; i < 10; i++) {
            numero = leia.nextInt();
            setNumeros.add(numero);
        }

        Iterator<Integer> isetNumeros = setNumeros.iterator();

        while (isetNumeros.hasNext()) {
            System.out.println(isetNumeros.next());
        }
    }

}
