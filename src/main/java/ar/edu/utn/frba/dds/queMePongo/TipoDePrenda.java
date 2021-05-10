package ar.edu.utn.frba.dds.queMePongo;

public class TipoDePrenda {

    private String tipo;
    private Categoria categoria;

    public TipoDePrenda(String _tipo,Categoria _categoria){

        this.categoria = _categoria;
        this.tipo = _tipo;
    }

    public String getTipo(){

        return this.tipo;
    }

    public Categoria getCategoria(){

        return this.categoria;
    }
}
