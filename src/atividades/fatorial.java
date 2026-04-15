package atividades;

import java.util.Scanner;

public class fatorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero, total, contagem;

        numero = sc.nextInt();
        IO.println(numero + "!");
        contagem = numero;
        total = 1;
        while (contagem >= 1) {
            total *= contagem;
            if (contagem > 1) {
                IO.print(contagem + "*");
            } else {
                IO.print(contagem + "=" + total);
            }
            contagem--;
        }
    }
}