package ejerciciosUD9.ajedrez;

public interface JuegoTablero {

    /** 
     * Aquí está la explicación de cada método:
     * 
     * char indiceAPosicion(int indice): Este método tomará un índice numérico como
     * entrada y devolverá la letra correspondiente del tablero de ajedrez.
     * Por ejemplo, si se pasa el índice 0, este método devolverá la letra "A", si
     * se pasa el índice 1 devolverá "B", y así sucesivamente.
     * 
     * int indiceAPosicionN(int indice): Este método tomará un índice numérico como
     * entrada y devolverá su posición numérica correspondiente en el tablero de
     * ajedrez.
     * Por ejemplo, si se pasa el índice 0, este método devolverá 1, si se pasa el
     * índice 1 devolverá 2, y así sucesivamente.
     * 
     * int posicionAIndice(char posicion): Este método tomará una letra que indica
     * una posición en el tablero de ajedrez como entrada y devolverá su
     * correspondiente índice numérico.
     * Por ejemplo, si se pasa la letra "A", este método devolverá 0, si se pasa la
     * letra "B" devolverá 1, y así sucesivamente.
     * 
     * int posicionAIndice(int posicion): Este método tomará una posición numérica
     * en el tablero de ajedrez como entrada y devolverá su correspondiente índice
     * numérico.
     * Por ejemplo, si se pasa el número 1, este método devolverá 0, si se pasa el
     * número 2 devolverá 1, y así sucesivamente.
     * 
     * Estos métodos se utilizarán para realizar conversiones entre las coordenadas
     * del tablero de ajedrez y los índices de un array,
     * lo que será útil para diversos juegos de tablero que necesiten este tipo de
     * transformaciones para su implementación.
     */

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
