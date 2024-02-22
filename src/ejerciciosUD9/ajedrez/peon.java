package ejerciciosUD9.ajedrez;

import java.awt.Point;

public class peon extends pieza {
    /**
     * Constructor similar al de la clase torre:
     */
    public peon(int x, int y, ColorPieza color) {
        super(x, y, color);
    }

    /**
     * Metodo para mover la pieza:
     */
    @Override
    void mover(int x, int y) {
        if (this.getColorpieza() == ColorPieza.BLANCO) {
            if (this.getPosicion().x == 1 && this.getPosicion().y == y) {
                if (x == 1 || x == 2) {
                    setPosicion(new Point(this.getPosicion().x + x, y));
                }
            } else if (this.getPosicion().y == y) {
                setPosicion(new Point(this.getPosicion().x + 1, y));
            }
        }else{
            if (this.getPosicion().x == 8 && this.getPosicion().y == y) {
                if (x == 1 || x == 2) {
                    setPosicion(new Point(this.getPosicion().x - x, y));
                }
            }else if (this.getPosicion().y == y) {
                setPosicion(new Point(this.getPosicion().x-1, y));
            }
        }
    }
}
