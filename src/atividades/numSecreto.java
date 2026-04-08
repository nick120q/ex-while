package atividades;
import java.util.Scanner;
public class numSecreto {
    static void main() {
        int nSecreto, tentativa;
        Scanner sc = new Scanner(System.in);
        IO.print("Tente advinhar o número secreto: ");
        tentativa = sc.nextInt();
        nSecreto = 7;
        while(nSecreto != tentativa){
            if(nSecreto != tentativa){
                IO.println("Errou!");
            }
            IO.print("Tente novamente: ");
            tentativa = sc.nextInt();
        }
        IO.println("Parabéns, você acertou!");
    }
}
