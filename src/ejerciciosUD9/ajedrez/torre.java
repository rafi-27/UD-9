package ejerciciosUD9.ajedrez;

import java.awt.Point;

public class torre extends pieza{
    /**
    * Implementamos el primer constructor de nuesta clase pieza.
    */
    public torre(int x, int y,ColorPieza colorPieza){
        this.setPosicion(new Point(x, y));
        this.setColorpieza(colorPieza);
    }



    @Override
    void mover(int x, int y) {

    }
  





}
