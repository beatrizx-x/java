import java.util.Scanner;

public class repeticao {
    static void main() {
        int contador = 0;

        Scanner estaComFome = new Scanner(System.in);
        System.out.println("esta com fome?");
        String fome = estaComFome.nextLine();
        String[] quantidadeDeFome = new String[6];
        quantidadeDeFome[0] = fome;
        while (fome.equalsIgnoreCase("sim")) {
            System.out.println("pode comer!");
            quantidadeDeFome[contador++] = fome;
            System.out.print("Ainda esta com fome? ");
            fome = estaComFome.nextLine();
            if (contador>= 5) {
                System.out.println("vai ficar gorda!! para de comer");
            }

        }


    }

}


