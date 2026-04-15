package atividades;

import java.util.Scanner;

public class contadorPositivosNegativos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero, positivo, negativo;
        IO.println("Digite numeros, contarei quantos numeros negativos e quantos positivos que voce colocou");
        numero = sc.nextInt();
        positivo = 0;
        negativo = 0;
        while(true){
            if (numero == 0){
                break;
            }
            if (numero > 0){
                positivo++;
            }else{
                negativo++;
            }
            numero = sc.nextInt();
        }
        IO.println("Números positivos: " + positivo);
        IO.println("Números negativos: " + negativo);
    }
}
