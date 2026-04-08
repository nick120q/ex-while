package atividades;
import java.util.Scanner;
public class contadorPares {
    static void main() {
    int pares, contador;
    contador = 0;
    while(contador <= 50) {
        pares = contador;
    if (contador % 2 == 0){
        IO.println(pares);
    }
        contador++;
    }
    }
}
