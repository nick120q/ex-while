package atividades;
import java.util.Scanner;
public class mediaNotas {
    static void main() {
        int nota, divisao, media, nota1;
        Scanner sc = new Scanner(System.in);
        IO.println("Digite suas notas e calcule a média(digite -1 para parar)");
        divisao = 0;
        nota1 = 0;
        while(true){
            nota = sc.nextInt();
            if (nota == -1){
                break;
            }
            nota1 += nota;
            divisao++;
        }
        media = nota1 / divisao;
        IO.print("Sua média é: " + media);
    }
}
