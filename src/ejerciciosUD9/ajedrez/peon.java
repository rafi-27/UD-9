package ejerciciosUD9.ajedrez;
public class peon extends pieza implements JuegoTablero{
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
        if (this.getColorpieza() == ColorPieza.NEGRO) {
            if (this.getPosicion().x == 1 && this.getPosicion().y == y) {
                if (x == 1 || x == 2) {
                    this.posicion.setLocation(x, y);
                }
            } else if (this.getPosicion().x-x == 1) {
                this.posicion.setLocation(x+1, y);
            }
        }else{
            if (this.getPosicion().x == 7 && this.getPosicion().y == y) {
                if (x == 1 || x == 2) {
                    this.posicion.setLocation(x-1, y);
                }
            }else if (this.getPosicion().x-x == 1) {
                this.posicion.setLocation(x-1, y);
            }
        }
    }

    /**
    * Procedemos a implementarle los interfaces:
    */

    // devolverá la letra correspondiente del tablero de ajedrez.
    @Override
    public char indiceAPosicion(int indice) {
        String letraTablero = "ABCDEFGH";
        return letraTablero.charAt(indice);
    }

    // devolverá su posición numérica
    @Override
    public int indiceAPosicionN(int indice) {
        if (indice >= 0 && indice <= 7) {
            return indice + 1;
        }
        return -1;
    }

    // Devolvera posicion numerica de la letra.
    @Override
    public int posicionAIndice(char posicion) {
        String letraTablero = "ABCDEFGH";
        if (letraTablero.contains(String.valueOf(posicion))) {
            return (letraTablero.indexOf(posicion) + 1);
        }
        return -1;
    }

    // devolverá su correspondiente índice numérico.
    @Override
    public int posicionAIndice(int posicion) {
        if (posicion >= 1 && posicion <= 8) {
            return posicion-1;
        }
        return -1;
    }
}
