import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String categoria;
        int motores;
        String tipo;
        String nome;

        System.out.println("Digite categoria do avião: ");
        categoria = teclado.next();
        System.out.println("Digite a quantidade de motores: ");
        motores = teclado.nextInt();
        System.out.println("Digite o tipo do avião: ");
        tipo = teclado.next();
        System.out.println("Digite o nome do avião: ");
        nome = teclado.next();


        Aviao a = new Aviao(categoria, motores, tipo, nome);

        a.detalheAviao();
        a.detalheAeronave();



    }

}
