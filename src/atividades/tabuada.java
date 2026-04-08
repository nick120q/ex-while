package atividades;
import java.util.Scanner;
public class tabuada {
    static void main() {
        int n1, tabuada, calculo;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        tabuada = 1;
        while(tabuada <= 10){
            calculo = n1 * tabuada;
            IO.println(n1 + "*" + tabuada + "=" + calculo);
            tabuada++;
        }
    }
}
