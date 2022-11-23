import java.util.Scanner;

public class Helicoptero extends Aeronaves{

    private int qntDeHelices;
    private String nome;
    private int qntPortas;

    public Helicoptero(int qntDeHelices, String nome, int qntPortas, String categoria, int qntDeMotores, int tipo){
        super(categoria, qntDeMotores, tipo);
        this.qntDeHelices = qntDeHelices;
        this.qntPortas = qntPortas;
        this.nome = nome;
    }

    public void detalhesHelicoptero(){
        System.out.println("!!!! Dado do Helicóptero: !!!!"
                + "\nQuantidade de Helices: " + qntDeHelices
                + "\nQuantidade de Portas: " + qntPortas
                + "\nNome: " + nome);
    }



}
