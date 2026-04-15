package atividades;

import java.util.Scanner;

public class maiorNumero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero, maior;
        IO.println("Digite numeros, verei qual o maior");
        numero = sc.nextInt();
        maior = numero;
        while(true){
            if (numero == 0){
                break;
            }
            numero = sc.nextInt();
        if (numero > maior){
            maior = numero;
        }
        }
        IO.println("maior numero que você digitou foi " + maior);
    }
}
