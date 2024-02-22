package ejerciciosUD9.ajedrez;

import java.awt.Point;

public class torre extends pieza {
    /**
    * Implementamos el primer constructor de nuesta clase pieza.
    */
    public torre(int x, int y,ColorPieza colorPieza){
        super(x, y, colorPieza);
    }

    @Override
    void mover(int x, int y) {
        if (comprobarPosicion(x)&&comprobarPosicion(y)) {
            if (this.getPosicion().x==x || this.getPosicion().y==y) {
                setPosicion(new Point(x, y));
            }
        }
    }
}
