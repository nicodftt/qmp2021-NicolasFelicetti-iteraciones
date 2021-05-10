package ar.edu.utn.frba.dds.queMePongo;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

  private final Prenda prendaTest =
          new Prenda(new TipoDePrenda("PANTALON",
          Categoria.PARTE_INFERIOR),
          Categoria.PARTE_INFERIOR,
          Material.ALGODON,new Color(45,67,78),null);

  @Test
  public void elTipoDeUnaPrenda() {

    assertEquals(prendaTest.getTipo(), "PANTALON");
  }

  @Test
  public void elMaterialDeLaPrenda() {

    assertEquals(prendaTest.getMaterial(),Material.ALGODON);
  }

  @Test
  public void laCategoriaDeUnaPrenda() {
    assertEquals(prendaTest.getCategoria(),Categoria.PARTE_INFERIOR);
  }

  @Test
  public void elColorPrimarioDeUnaPrenda() {
    Color color = prendaTest.getColorPrimario();
    assertEquals(color.getRed(), 45, 0);
    assertEquals(color.getGreen(), 67, 0);
    assertEquals(color.getBlue(), 78, 0);
  }



}
