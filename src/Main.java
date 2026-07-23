import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("Elige la cantidad de numeros para randomizar");
        System.out.println("-----------------------------------");
        System.out.print(": ");

        int eleccion = scanner.nextInt();
        Random random = new Random();

        int[] numeros = new int[eleccion];


        for (int i = 0; i < eleccion; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Numeros generados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        System.out.println("-----------------------------------");
        System.out.println("Presiona cualquier numero para continuar");
        System.out.println("-----------------------------------");
        scanner.nextInt();

        ordenar(numeros);


        System.out.println("Ordenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        System.out.println("Numero mayor:");
        System.out.println(nMayor(numeros));

        System.out.println("Numero menor:");
        System.out.println(nMenor(numeros));

        scanner.close();
    }


    public static void ordenar(int[] numeros) {
        Arrays.sort(numeros);
    }

 
    public static int nMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static int nMenor(int[] numeros) {
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }
}