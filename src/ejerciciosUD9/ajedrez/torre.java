package ejerciciosUD9.ajedrez;


public class torre extends pieza implements JuegoTablero {
    /**
     * Implementamos el primer constructor de nuesta clase pieza.
     */
    public torre(int x, int y, ColorPieza colorPieza) {
        super(x, y, colorPieza);
    }

    /**
     * Moveremos las fichas mientras una coordenada se mantenga igual.
     */
    @Override
    void mover(int x, int y) {
        if (comprobarPosicion(x) && comprobarPosicion(y)) {
            if (this.getPosicion().x == x || this.getPosicion().y == y) {
                this.posicion.setLocation(x, y);
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