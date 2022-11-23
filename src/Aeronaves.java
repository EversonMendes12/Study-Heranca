public class Aeronaves {

    private String categoria;
    private int qntDeMotores;
    private String tipo;

    public Aeronaves(String categoria, int qntDeMotores, String tipo){
        this.categoria = categoria;
        this.qntDeMotores = qntDeMotores;
        this.tipo = tipo;
    }

    public void detalheAeronave(){
        System.out.println("Categoria: " + categoria
                + "\nQuantidade de Motores: " + qntDeMotores
                + "\nTipo: " + tipo);
    }


}
