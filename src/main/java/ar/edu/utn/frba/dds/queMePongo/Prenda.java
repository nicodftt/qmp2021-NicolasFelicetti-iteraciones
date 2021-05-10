package ar.edu.utn.frba.dds.queMePongo;

public class Prenda {

    private TipoDePrenda tipoDePrenda;
    private Categoria categoria;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;

    public Prenda(TipoDePrenda _tipoDePrenda,Categoria _categoria,Material _material,Color _colorPrimario,Color _colorSecundario){

        this.tipoDePrenda=_tipoDePrenda;
        this.categoria = _categoria;
        this.material =_material;
        this.colorPrimario = _colorPrimario;
        this.colorSecundario = _colorSecundario;
        }


    private void validarCategoria(Categoria _categoria){

        if(_categoria != tipoDePrenda.getCategoria())
            throw new RuntimeException("La categoria ingresada no coincide con el tipo de prenda");

    }

    public String getTipo() {
       return this.tipoDePrenda.getTipo();

    }

    public Material getMaterial(){

        return this.material;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public Color getColorPrimario(){

        return this.colorPrimario;
    }

    public Color getColorSecundario(){

        return this.colorSecundario;
    }
}
