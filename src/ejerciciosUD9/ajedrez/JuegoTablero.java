package ejerciciosUD9.ajedrez;

public interface JuegoTablero {
    // pasará un índice numérico a su letra correspondiente del tablero
    char indiceAPosicion(int indice);

    // pasará un índice numérico a su posición numérica del tablero
    int indiceAPosicionN(int indice);

    // pasará una letra que indica una posición en el tablero a su correspondiente
    // índice
    int posicionAIndice(char posicion);

    // pasará una posición númerica en el tablero a su correspondiente índice
    int posicionAIndice(int posicion);
}
