import java.util.Scanner;

public class Aviao extends Aeronaves{

    private String nome;

    public Aviao(String categoria, int qntDeMotores, int tipo, String nome){
        super(categoria, qntDeMotores, tipo);
        this.nome = nome;
    }

    public void detalheAviao(){

        System.out.println("!!!! Dados do avião: !!!!"
        + "\nNome: " + nome);
    }
}
