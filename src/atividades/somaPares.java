package atividades;

import java.util.Scanner;

public class somaPares {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int contador, numero, soma;
        numero = sc.nextInt();
        contador = 2;
        soma = 0;
        while(contador <= numero) {
            if (contador % 2 == 0){
                    soma += contador;
                if (contador + 2 <= numero) {
                    IO.print(contador + "+");
                } else {
                    IO.print(contador + "=" + soma);
            }
        }
        contador++;
    }
    }
}

