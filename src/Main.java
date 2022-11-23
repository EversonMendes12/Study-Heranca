import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int selecao;
        String categoria;
        int qntDeMotores;
        int tipo;
        String nome;
        int qntPortas;
        int qntDeHelices;

        System.out.println("Escolha a aeronave que deseja cadastrar: \n"
                + "\n1 = Avião"
                + "\n2 = Helicoptero");
        selecao = teclado.nextInt();

        if (selecao == 1){

            System.out.println("!!!! Cadastro Avião: !!!!"
                    + "\nDigite o nome do avião: ");
            nome = teclado.next();
            System.out.println("Digite categoria do avião: ");
            categoria = teclado.next();
            System.out.println("Digite a quantidade de motores: ");
            qntDeMotores = teclado.nextInt();
            System.out.println("\nAvião salvo\n");
            tipo = selecao;
            Aviao a = new Aviao(categoria, qntDeMotores, tipo, nome);

            a.detalheAviao();
            a.detalheAeronave();

        } else if (selecao == 2) {

            System.out.println("!!!! Cadastro Helicóptero: !!!!"
                    + "\nNome do Helicóptero: ");
            nome = teclado.next();
            System.out.println("Quantidade de Helices: ");
            qntDeHelices = teclado.nextInt();
            System.out.println("Quantidade de Portas: ");
            qntPortas = teclado.nextInt();
            System.out.println("Digite categoria do Helicóptero: ");
            categoria = teclado.next();
            System.out.println("Digite a quantidade de motores: ");
            qntDeMotores = teclado.nextInt();
            System.out.println("\nHelicóptero salvo\n");
            tipo = selecao;

            Helicoptero h = new Helicoptero(qntDeHelices,nome, qntPortas, categoria, qntDeMotores, tipo);

            h.detalhesHelicoptero();
            h.detalheAeronave();

        }


    }

}
