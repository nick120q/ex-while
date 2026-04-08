package atividades;
import java.util.Scanner;
public class mediaNotas {
    static void main() {
        int nota, divisao, media;
        Scanner sc = new Scanner(System.in);
        IO.println("Digite suas notas e calcule a média(digite -1 para parar)");
        divisao = 0;
        nota = 0;
        while(true){
            if (nota == -1){
                break;
            }
            divisao++;
        }
        media = nota / divisao;
        IO.print("Sua média é: " + media);
    }
}
