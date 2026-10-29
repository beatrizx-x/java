import java.util.Scanner;

public class tomadaDeDecisoes {
    static void main() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();
        boolean entrouNaFesta = false;

        if (idade >= 50) {
            System.out.print("velho demais, não pode entrar na festa!");
        } else if (idade >= 18) {
            entrouNaFesta = !false;

            System.out.print("pode entrar na festa!!");

        } else {
            System.out.print("proibido menores de 18 anos");
        }

        if (entrouNaFesta == true) {
            System.out.print("Bem vindo ao bar tres corações! oque deseja pedir?");
            Scanner bebidas = new Scanner(System.in);
            String bebida = bebidas.nextLine();
            System.out.print("aqui está a sua bebida, " + bebida);

            System.out.print(" a bebida custa 50 reais, deseja compra-la?");
            Scanner pagarBebida = new Scanner(System.in);
            String pagar = pagarBebida.nextLine().toLowerCase();

            if (pagar == "sim") {
                System.out.print("muito obrigado, e se divirta ");
            } else {
                System.out.print("então vai procurar oq fazer");
            }
        }

    }

}
