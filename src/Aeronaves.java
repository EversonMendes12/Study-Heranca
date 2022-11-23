import java.util.Scanner;

public class Aeronaves {

    private String categoria;
    private int qntDeMotores;
    private int tipo;

    public Aeronaves(String categoria, int qntDeMotores, int tipo){
        this.categoria = categoria;
        this.qntDeMotores = qntDeMotores;
        this.tipo = tipo;
    }


    public void detalheAeronave(){
        System.out.println("Categoria: " + categoria
                + "\nQuantidade de Motores: " + qntDeMotores
                + "\nTipo: " + ((tipo == 1) ? "Avião" : "Helicóptero"));
    }
}
